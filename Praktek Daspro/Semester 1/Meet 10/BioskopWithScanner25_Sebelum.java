import java.util.Scanner;
public class BioskopWithScanner25_Sebelum {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];
        while (true){
            System.out.print("Masukkan Nama : ");
            nama = input25.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = input25.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = input25.nextInt();
            input25.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya ? (y/n) : ");
            next = input25.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
