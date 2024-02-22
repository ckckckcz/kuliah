import java.util.Scanner;

public class Percobaan2_pertanyaan {

    // Metode untuk menghitung pangkat
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    // Metode untuk mencetak deret perhitungan pangkat
    static void cetakDeretPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
        } else {
            System.out.print(x + "x");
            cetakDeretPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = sc.nextInt();

        System.out.print("Deret perhitungan pangkat " + bilangan + "^" + pangkat + " adalah: ");
        cetakDeretPangkat(bilangan, pangkat);
        
        int hasilPangkat = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasilPangkat);
    }
}
