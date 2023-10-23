import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {
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
                    loggedInUser = login(scanner);
                    if (loggedInUser != null) {
                        userMenu(scanner);
                    }
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.println(" Selamat Tinggal Sampai Jumpa Lagi ! ");
                    System.out.println("======================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("==============================================");
                    System.out.println(" Pilihanmu tidak diketahui, mohon coba lagi ");
                    System.out.println("==============================================");
                    break;
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

    private static User login(Scanner scanner) {
        System.out.println("========");
        System.out.println(" Masuk ");
        System.out.println("=======");

        while (true) {
            System.out.print("Masukkan Username : ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Kata Sandi : ");
            String password = scanner.nextLine();

            User user = userMap.get(username);
            if (user != null && user.getPassword().equals(password)) {
                System.out.println("==================================================");
                System.out.println(" Masuk Berhasil. Selamat Datang, " + username + "!");
                System.out.println("==================================================");
                return user;
            } else {
                System.out.println("=======================================================");
                System.out.println("Login gagal. Username atau password salah. Coba lagi.");
                System.out.println("=======================================================");
                System.out.println("1. Coba lagi");
                System.out.println("2. Kembali ke menu utama");
                System.out.print("Masukkan pilihan: ");
                int loginChoice = scanner.nextInt();
                scanner.nextLine();
                if (loginChoice == 2) {
                    return null;  // Kembali ke menu utama
                }
            }
        }
    }

    private static void userMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Check-in");
            System.out.println("2. Lihat Booking");
            System.out.println("3. Informasi User");
            System.out.println("4. Sortir User");
            System.out.println("5. Cari User");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihanmu : ");
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
                    sortUsers();
                    break;
                case 5:
                    searchUser(scanner);
                    break;
                case 6:
                    System.out.println("=====================");
                    System.out.println(" Anda Sudah Logout ");
                    System.out.println("=====================");
                    isLoggedIn = false;
                    loggedInUser = null;
                    return;
                default:
                    System.out.println("=============================================");
                    System.out.println(" Pilihanmu tidak diketahui, mohon coba lagi ");
                    System.out.println("=============================================");
                    break;
            }
        }
    }

    private static void sortUsers() {
        User[] users = userMap.values().toArray(new User[0]);
        Arrays.sort(users, (user1, user2) -> user1.getUsername().compareTo(user2.getUsername()));

        System.out.println("====================================================");
        System.out.println("Daftar Pengguna setelah diurutkan berdasarkan Username");
        System.out.println("====================================================");
        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

    private static void searchUser(Scanner scanner) {
        System.out.print("Masukkan Username yang ingin Anda cari: ");
        String usernameToSearch = scanner.nextLine();
        User user = userMap.get(usernameToSearch);

        if (user != null) {
            System.out.println("===================================");
            System.out.println("Informasi User yang Anda Cari:");
            System.out.println("===================================");
            System.out.println("NIK: " + user.getNik());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Tanggal Lahir: " + user.getDateOfBirth());
            System.out.println("No Telephone: " + user.getPhoneNumber());
            System.out.println("Alamat: " + user.getAddress());
        } else {
            System.out.println("====================================");
            System.out.println("User dengan username tersebut tidak ditemukan.");
            System.out.println("====================================");
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
    private String[] bookingInfo = new String[4]; // Array untuk menyimpan info pemesanan

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

    public String getNik() {
        return nik;
    }

    public String getUsername() {
        return username;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void checkIn(Scanner scanner) {
        System.out.println("=========");
        System.out.println(" Check-in ");
        System.out.println("=========");
        System.out.print("Masukkan Tanggal : ");
        String tanggalBooking = scanner.nextLine();
        System.out.print("Masukkan Jam (HH:mm): ");
        String waktuBooking = scanner.nextLine();

        System.out.println("Pilih Opsi Gedung:");
        System.out.println("1. Pernikahan");
        System.out.println("2. Olahraga");
        System.out.println("3. Rapat");
        System.out.print("Masukkan Pilihan Gedung: ");
        int memilihGedung = scanner.nextInt();
        scanner.nextLine();

        switch (memilihGedung) {
            case 1:
                bookingInfo[0] = "Pernikahan";
                break;
            case 2:
                bookingInfo[0] = "Olahraga";
                break;
            case 3:
                bookingInfo[0] = "Rapat";
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
                bookingInfo[1] = "DP";
                break;
            case 2:
                bookingInfo[1] = "Lunas";
                break;
            default:
                System.out.println("Pilihan Pembayaran tidak valid.");
                return;
        }

        // Menyimpan info pemesanan
        bookingInfo[2] = tanggalBooking;
        bookingInfo[3] = waktuBooking;

        System.out.println("Pemesanan berhasil!");
    }

    public void viewBooking() {
        if (bookingInfo[2] != null && bookingInfo[3] != null && bookingInfo[0] != null && bookingInfo[1] != null) {
            System.out.println("=======================");
            System.out.println(" Informasi Pemesanan ");
            System.out.println("=======================");
            System.out.println("Tanggal Pemesanan: " + bookingInfo[2]);
            System.out.println("Jam Pemesanan: " + bookingInfo[3]);
            System.out.println("Jenis Gedung: " + bookingInfo[0]);
            System.out.println("Opsi Pembayaran: " + bookingInfo[1]);
        } else {
            System.out.println("==============================");
            System.out.println("Anda belum melakukan pemesanan");
            System.out.println("==============================");
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
