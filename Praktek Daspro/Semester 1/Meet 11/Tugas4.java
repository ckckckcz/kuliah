import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi jajar genjang: ");
        int tinggi = scanner.nextInt();
        System.out.print("Masukkan lebar jajar genjang: ");
        int lebar = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= lebar; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
