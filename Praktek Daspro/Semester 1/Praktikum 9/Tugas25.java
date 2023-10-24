import java.util.Scanner;

public class Tugas25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Meminta pengguna untuk memasukkan nilai tiap elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // Inisialisasi nilai tertinggi dan nilai terendah
        int max = arr[0];
        int min = arr[0];
        // Menghitung total nilai untuk perhitungan rata-rata
        int total = arr[0];
        // Menghitung nilai tertinggi, nilai terendah, dan total
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            total += arr[i];
        }
        // Menghitung nilai rata-rata
        double rataRata = (double) total / n;
        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
