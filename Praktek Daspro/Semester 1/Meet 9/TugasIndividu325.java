import java.util.Scanner;

public class TugasIndividu325 {
    public static void main(String[] args) {
        // Fungsi array untuk menyimpan nama bulan
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka 1-12: ");
        int angka = scanner.nextInt();
        // Memeriksa apakah angka yang dimasukkan valid (antara 1 dan 12)
        if (angka >= 1 && angka <= 12) {
            String bulan = namaBulan[angka - 1];
            System.out.println("Bulan yang sesuai dengan angka yang anda inputkan " + angka + " adalah " + bulan);
        } else {
            System.out.println("Angka yang anda inputkan tidak valid,  Harap masukkan angka antara 1 dan 12.");
        }
        scanner.close();
    }
}
