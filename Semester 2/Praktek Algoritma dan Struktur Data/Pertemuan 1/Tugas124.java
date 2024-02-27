import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        // Array kode plat mobil
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        // Array nama kota
        String[][] KOTA = {
                { "B", "A", "N", "T", "E", "N" },
                { "J", "A", "K", "A", "R", "T", "A" },
                { "B", "A", "N", "D", "U", "N", "G" },
                { "C", "I", "R", "E", "B", "O", "N" },
                { "B", "O", "G", "O", "R" },
                { "P", "E", "K", "A", "L", "O", "N", "G", "A", "N" },
                { "S", "E", "M", "A", "R", "A", "N", "G" },
                { "S", "U", "R", "A", "B", "A", "Y", "A" },
                { "M", "A", "L", "A", "N", "G" },
                { "T", "E", "G", "A", "L" }
        };

        Scanner sc24 = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char kode = sc24.next().charAt(0);
        sc24.close();

        // mencari nama kota berdasarkan kode plat mobil
        int kodeIndex = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                kodeIndex = i;
                break;
            }
        }

        // menampilkan kota sesuai kode plat
        if (kodeIndex != -1) {
            for (int j = 0; j < KOTA[kodeIndex].length; j++) {
                System.out.print(KOTA[kodeIndex][j]);
            }
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }
    }
}