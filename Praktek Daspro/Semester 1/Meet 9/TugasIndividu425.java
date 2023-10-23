import java.util.Scanner;

public class TugasIndividu425 {
    public static void main(String[] args) {
        // Mendefinisikan jumlah elemen dalam array
        int jumlahElemen = 8;

        // Membuat array untuk menyimpan bilangan bulat
        int[] arrayBilangan = new int[jumlahElemen];

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mengisi array dengan input dari pengguna
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayBilangan[i] = scanner.nextInt();
        }

        // Menutup objek Scanner
        scanner.close();

        // Menghitung rata-rata elemen array
        int total = 0;
        for (int i = 0; i < jumlahElemen; i++) {
            total += arrayBilangan[i];
        }

        double rataRata = (double) total / jumlahElemen;

        System.out.println("Rata-rata dari elemen-elemen array adalah: " + rataRata);
    }
}
