import java.util.Scanner;

public class Percobaan2 {

    // Metode untuk menghitung pangkat
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = sc.nextInt();
        int hasilPangkat = hitungPangkat(bilangan, pangkat);
        System.out.println(bilangan + " pangkat " + pangkat + " adalah: " + hasilPangkat);
    }
}