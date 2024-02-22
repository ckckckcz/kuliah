import java.util.Scanner;

public class BioskopWithScanner25_Setelah {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan menu: ");
            int menuChoice = input25.nextInt();
            input25.nextLine(); // Membuang karakter newline

            switch (menuChoice) {
                case 1:
                    inputDataPenonton(input25, penonton); // jika user memilih 1 maka akan diarahkan ke input data penonton
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton); // jika user memilih 2 maka akan diarahkan ke daftar penonton
                    break;
                case 3:
                    System.out.println("Terima kasih, sampai jumpa!"); // jika user memilih 3 maka akan end program
                    input25.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    public static void inputDataPenonton(Scanner scanner, String[][] penonton) {
        String nama, next;
        int baris, kolom;
    
        while (true) {
            System.out.print("Masukkan Nama : ");
            nama = scanner.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = scanner.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline
    
            if (isValidSeat(penonton, baris, kolom)) {
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                } else {
                    System.out.println("Maaf, kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Kursi tidak tersedia atau tidak valid. Silakan coba lagi.");
            }
    
            System.out.print("Input penonton lainnya ? (y/n) : ");
            next = scanner.nextLine();
    
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    

    public static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("Daftar Penonton:");
    
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                } else {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                }
            }
        }
    }
    

    public static boolean isValidSeat(String[][] penonton, int baris, int kolom) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length; // Fungsi inilah yang akan memerikas apakah nomor baris dan kolom sesuai dengan array penonton
    }
}
