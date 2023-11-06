import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        // Perulangan untuk mencetak baris
        for (int i = 1; i <= N; i++) {

            // Perulangan untuk mencetak angka dalam satu baris
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // Menambahkan spasi antara angka
            }

            // Baris baru setelah setiap baris angka
            System.out.println();
        }
    }
}