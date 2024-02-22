import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak spasi sebelum angka
                for (int space = 1; space <= N - i; space++) {
                    System.out.print(" ");
                }
                
                // Mencetak angka dari kanan atas ke kiri bawah
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                
                System.out.println();
            }
        }
    }
}
