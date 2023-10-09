import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class main {
    private static Map<String, User> userMap = new HashMap<>();
    private static boolean isLoggedIn = false;
    private static User loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======================================");
            System.out.println(" Selamat Datang di Gedung Serba Guna ");
            System.out.println("======================================");
            System.out.println("1. Buat Akun");
            System.out.println("2. Masuk");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihanmu : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.println(" Selamat Tinggal Sampai Jumpa Lagi ! ");
                    System.out.println("======================================");
                    System.exit(0);
                default:
                    System.out.println("==============================================");
                    System.out.println(" Pilihanmu tidak diketahui, mohon coba lagi ");
                    System.out.println("==============================================");
                    break;
            }

            if (isLoggedIn) {
                System.out.println("1. Check-in");
                System.out.println("2. Lihat Booking");
                System.out.println("3. Informasi User");
                System.out.println("4. Keluar");
                System.out.print("Masukkan Pilihamu : ");
                int userChoice = scanner.nextInt();
                scanner.nextLine();

                switch (userChoice) {
                    case 1:
                        loggedInUser.checkIn(scanner);
                        break;
                    case 2:
                        loggedInUser.viewBooking();
                        break;
                    case 3:
                        loggedInUser.informasiUser();
                        break;
                    case 4:
                        System.out.println("=====================");
                        System.out.println(" Anda Sudah Logout ");
                        System.out.println("=====================");
                        isLoggedIn = false;
                        loggedInUser = null;
                        break;
                    default:
                        System.out.println("=============================================");
                        System.out.println(" Pilihanmu tidak diketahui, mohon coba lagi ");
                        System.out.println("=============================================");
                        break;
                }
            } else {
                System.out.println("-");
            }
        }
    }

    private static void createAccount(Scanner scanner) {
        System.out.println("============");
        System.out.println(" Buat Akun ");
        System.out.println("============");
        System.out.print("Masukkan NIK : ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan Username : ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Masukkan No Telephone : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        String address = scanner.nextLine();
        System.out.print("Masukkan Kata Sandi : ");
        String password = scanner.nextLine();

        User newUser = new User(nik, username, dateOfBirth, phoneNumber, address, password);

        userMap.put(username, newUser);

        System.out.println("==================================================");
        System.out.println(" Akun berhasil dibuat, anda sekarang sudah login ");
        System.out.println("==================================================");
        isLoggedIn = true;
        loggedInUser = newUser;
    }

    private static void login(Scanner scanner) {
        System.out.println("========");
        System.out.println(" Masuk ");
        System.out.println("=======");
        System.out.print("Masukkan Username : ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Kata Sandi : ");
        String password = scanner.nextLine();

        User user = userMap.get(username);
        if(user != null){
            if( user.getPassword().equals(password)) {
                System.out.println("==================================================");
                System.out.println(" Masuk Berhasil. Selamat Datang, " + username + "!");
                System.out.println("==================================================");
                isLoggedIn = true;
                loggedInUser = user;
            } else {
                System.out.println("Password dan Username anda salah");
            }
        }else{
            System.out.println("Username atau Password tidak diketahui, coba ulangi lagi !");
        }
    }
}

class User {
    private String nik;
    private String username;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;
    private String password;
    private String tanggalBooking;
    private String waktuBooking;
    private String tipeGedung;
    private String opsiPembayaran;

    public User(String nik, String username, String dateOfBirth, String phoneNumber, String address, String password) {
        this.nik = nik;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        
    }

    public String getPassword() {
        return password;
    }


    public void checkIn(Scanner scanner) {
    System.out.println("=========");
    System.out.println(" Check-in ");
    System.out.println("=========");
    System.out.print("Masukkan Tanggal : ");
    tanggalBooking = scanner.nextLine();
    System.out.print("Masukkan Jam (HH:mm): ");
    waktuBooking = scanner.nextLine();

    // Pilihan opsi gedung
    System.out.println("Pilih Opsi Gedung:");
    System.out.println("1. Pernikahan");
    System.out.println("2. Olahraga");
    System.out.println("3. Rapat");
    System.out.print("Masukkan Pilihan Gedung: ");
    int memilihGedung = scanner.nextInt();
    scanner.nextLine(); 

    switch (memilihGedung) {
        case 1:
            tipeGedung = "Pernikahan";
            break;
        case 2:
            tipeGedung = "Olahraga";
            break;
        case 3:
            tipeGedung = "Rapat";
            break;
        default:
            System.out.println("Pilihan Gedung tidak valid.");
            return; 
    }
    System.out.println("Pilih Opsi Pembayaran:");
    System.out.println("1. DP");
    System.out.println("2. Lunas");
    System.out.print("Masukkan Pilihan Pembayaran: ");
    int paymentChoice = scanner.nextInt();
    scanner.nextLine(); 

    switch (paymentChoice) {
        case 1:
            opsiPembayaran = "DP";
            break;
        case 2:
            opsiPembayaran = "Lunas";
            break;
        default:
            System.out.println("Pilihan Pembayaran tidak valid.");
            return; 
    }

    System.out.println("Pemesanan berhasil!");
}

    public void viewBooking() {
    if (tanggalBooking != null && waktuBooking != null && tipeGedung != null && opsiPembayaran != null) {
        System.out.println("=======================");
        System.out.println(" Informasi Pemesanan ");
        System.out.println("=======================");
        System.out.println("Tanggal Pemesanan: " + tanggalBooking);
        System.out.println("Jam Pemesanan: " + waktuBooking);
        System.out.println("Jenis Gedung: " + tipeGedung);
        System.out.println("Opsi Pembayaran: " + opsiPembayaran);
    } else {
        System.out.println("Anda belum melakukan pemesanan.");
    }
}
    public void informasiUser() {
    System.out.println("=======================");
    System.out.println(" Informasi User ");
    System.out.println("=======================");
    System.out.println("NIK: " + nik);
    System.out.println("Username: " + username);
    System.out.println("No Telephone: " + phoneNumber);
    System.out.println("Alamat: " + address);
}

}
