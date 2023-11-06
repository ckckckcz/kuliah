import java.util.Scanner;

public class NestedLoop_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temps = new double[5][7]; 

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            double totalSuhuKota = 0.0; // Untuk menghitung total suhu kota
            for (int j = 0; j < temps[i].length; j++) { 
                System.out.print("Masukkan suhu ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble(); 
                totalSuhuKota += temps[i][j]; // Menambahkan suhu harian ke total suhu kota
            }
            double rataRataKota = totalSuhuKota / temps[i].length; // Menghitung rata-rata suhu kota
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + rataRataKota);
            System.out.println();
        }

        // Menampilkan array temps dengan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double suhu : temps[i]) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }
    }
}
