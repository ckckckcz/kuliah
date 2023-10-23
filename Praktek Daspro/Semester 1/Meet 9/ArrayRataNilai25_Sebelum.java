import java.util.Scanner;

public class ArrayRataNilai25_Sebelum {
    public static void main(String[] args) {
        int[] nilaiMhs = new int[10];
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        // Menghitung rata-rata nilai
        rata2 = total / nilaiMhs.length;

        System.out.println("Rata-rata nilai = " + rata2);
    }
}
