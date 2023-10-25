import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.UUID;

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

        if (nik.isEmpty() || username.isEmpty() || password.isEmpty() || phoneNumber.isEmpty() || address.isEmpty() || dateOfBirth.isEmpty()){
            System.out.println("======================================================");
            System.out.println("Tolong isi semua data yang diperlukan untuk mendaftar");
            System.out.println("======================================================");
            return;
        }

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
            System.out.println("2. Check-out");
            System.out.println("3. Informasi User");
            System.out.println("4. Lihat Informasi Yang Di Booking Sekarang");
            System.out.println("5. Lihat History Pemesanan");
            System.out.println("6. Cari User");
            System.out.println("7. Keluar");
            System.out.print("Masukkan Pilihanmu : ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    loggedInUser.checkIn(scanner);
                    break;
                case 2:
                    loggedInUser.checkOut();
                    break;
                case 3:
                    loggedInUser.informasiUser();
                    break;
                case 4:
                    loggedInUser.viewBooking();
                    break;
                case 5:
                    loggedInUser.viewBookingHistory();
                    break;
                case 6:
                    searchUser(scanner);
                    break;
                case 7:
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

    private static void searchUser(Scanner scanner) {
        System.out.print("Masukkan Username yang ingin Anda cari: ");
        String usernameToSearch = scanner.nextLine();
        User user = userMap.get(usernameToSearch);

        if (user != null) {
            System.out.println("===================================================================================");
            System.out.println("            Informasi User yang Anda Cari");
            System.out.println("===================================================================================");
            System.out.println(" NIk           | Username          | Tanggal Lahir  | No Telephone | Alamat ");
            System.out.println("====================================================================================");

            // Format output menjadi tabel
            String nik = String.format("%-15s", user.getNik());
            String username = String.format("%-19s", user.getUsername());
            String tanggalLahir = String.format("%-16s", user.getDateOfBirth());
            String noTelephone = String.format("%-13s", user.getPhoneNumber());
            String alamat = String.format("%-12s", user.getAddress());

            System.out.println(nik + " | " + username + " | " + tanggalLahir + " | " + noTelephone + " | " + alamat);
        } else {
            System.out.println("====================================");
            System.out.println("User dengan username tersebut tidak ditemukan.");
            System.out.println("====================================");
        }
        System.out.println("=============================================================================");
    }
}

class User {
    private String nik;
    private String username;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;
    private String password;
    private String[] bookingInfo = new String[5];
    private String[][] bookingHistory = new String[10][5];
    private String statusPemesanan = "Tidak Dipesan";
    private String idPemesanan;
    private Scanner scanner;

    public User(String nik, String username, String dateOfBirth, String phoneNumber, String address, String password) {
        this.nik = nik;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.idPemesanan = UUID.randomUUID().toString(); // Menghasilkan ID unik untuk setiap pemesanan
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

    bookingInfo[2] = tanggalBooking;
    bookingInfo[3] = waktuBooking;
    bookingInfo[4] = idPemesanan; // Menyimpan ID pemesanan

    historyBooking(bookingInfo);

    System.out.println("Pemesanan berhasil!");
    statusPemesanan = "Dipesan";
    System.out.println("Status Pemesanan: " + statusPemesanan);
    System.out.println("ID Pemesanan: " + idPemesanan);
    this.scanner = scanner;
}


    public void checkOut() {
        if ("Dipesan".equals(statusPemesanan)) {
            System.out.println("=========");
            System.out.println(" Check-out ");
            System.out.println("=========");

            if ("DP".equals(bookingInfo[1])) {
                System.out.println("Anda telah memilih pembayaran DP saat check-in. Anda harus melunasi sekarang.");
                System.out.print("1. Lunas: ");
                int paymentChoice = scanner.nextInt();
                scanner.nextLine();

                if (paymentChoice == 1) {
                    bookingInfo[1] = "Lunas";
                    System.out.println("Pembayaran berhasil dilunasi.");
                } else {
                    System.out.println("Pembayaran DP masih belum dilunasi.");
                    return;
                }
            }

            System.out.println("=================================================");
            System.out.println("              Struk Detail Pemesanan");
            System.out.println("=================================================");
            System.out.println("  Tanggal Pemesanan: " + bookingInfo[2]);
            System.out.println("  Jam Pemesanan: " + bookingInfo[3]);
            System.out.println("  Jenis Gedung: " + bookingInfo[0]);
            System.out.println("  Opsi Pembayaran: " + bookingInfo[1]);
            System.out.println("  ID Pemesanan: " + bookingInfo[4]);
            System.out.println("=================================================");

            statusPemesanan = "Tidak Dipesan";
            System.out.println("Status Pemesanan: " + statusPemesanan);
            Arrays.fill(bookingInfo, null);
        } else {
            System.out.println("==============================");
            System.out.println("Anda belum melakukan check-in.");
            System.out.println("==============================");
        }
    }

    public void viewBooking() {
        if (bookingInfo[2] != null && bookingInfo[3] != null && bookingInfo[0] != null && bookingInfo[1] != null) {
            System.out.println("=====================================================================================");
            System.out.println("                              Informasi Pemesanan");
            System.out.println("=====================================================================================");
            System.out.println(" No  |  Tanggal Pemesanan  |  Jam Pemesanan  |  Jenis Gedung  |  Opsi Pembayaran | ID Pemesanan");
            System.out.println("=====================================================================================");

            String no = String.format("%3s", "");
            String tanggal = String.format("%18s", bookingInfo[2]);
            String jam = String.format("%15s", bookingInfo[3]);
            String jenisGedung = String.format("%14s", bookingInfo[0]);
            String opsiPemesanan = String.format("%16s", bookingInfo[1]);
            String idPemesanan = String.format("%13s", bookingInfo[4]);

            System.out.println(no + " | " + tanggal + " | " + jam + " | " + jenisGedung + " | " + opsiPemesanan + " | " + idPemesanan);
        } else {
            System.out.println("==============================");
            System.out.println("Anda belum melakukan pemesanan");
            System.out.println("==============================");
        }
        System.out.println("======================================================================================");
    }

    public void historyBooking (String[] bookingInfo) {
        for (int i = 0; i < bookingHistory.length; i++){
            if (bookingHistory[i][0] == null){
                bookingHistory[i] = Arrays.copyOf(bookingInfo, bookingInfo.length);
                break;
            }
        }
    }

    public void viewBookingHistory() {
        System.out.println("=========================================================================");
        System.out.println(" No  | Tanggal Pemesanan | Jam Pemesanan | Jenis Gedung | Opsi Pemesanan | ID Pemesanan");
        System.out.println("=========================================================================");

        boolean hasHistory = false;

        for (int i = 0; i < bookingHistory.length; i++) {
            if (bookingHistory[i][0] != null) {
                hasHistory = true;

                String no = String.format("%4d", i + 1);
                String tanggal = String.format("%16s", bookingHistory[i][2]);
                String jam = String.format("%13s", bookingHistory[i][3]);
                String jenisGedung = String.format("%12s", bookingHistory[i][0]);
                String opsiPemesanan = String.format("%15s", bookingHistory[i][1]);
                String idPemesanan = String.format("%12s", bookingHistory[i][4]);

                System.out.println(no + " | " + tanggal + " | " + jam + " | " + jenisGedung + " | " + opsiPemesanan + " | " + idPemesanan);
            }
        }

        if (!hasHistory) {
            System.out.println("==============================");
            System.out.println("Tidak Ada Riwayat Pemesanan Anda");
            System.out.println("==============================");
        }
        System.out.println("=========================================================================");
    }

    public void informasiUser() {
        System.out.println("============================================================");
        System.out.println("                      Informasi User");
        System.out.println("============================================================");
        System.out.println("NIK           | Username          | No Telephone | Alamat ");
        System.out.println("============================================================");

        String nikFormatted = String.format("%-15s", nik);
        String usernameFormatted = String.format("%-19s", username);
        String noTelephoneFormatted = String.format("%-13s", phoneNumber);
        String alamatFormatted = String.format("%-12s", address);

        System.out.println(nikFormatted + " | " + usernameFormatted + " | " + noTelephoneFormatted + " | " + alamatFormatted);
        System.out.println("============================================================");
    }
}
