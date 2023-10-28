import java.util.Scanner;

public class WhileGaji25_Sesudah {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        // Deklarasi variabel
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0.0, totalGajiLembur = 0.0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input25.nextInt();
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input25.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input25.nextInt();

            if (jabatan.equalsIgnoreCase("Direktur")) {
                i++;
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                continue;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }
        System.out.println("Total Gaji Lembur : " + totalGajiLembur);
    }
}
