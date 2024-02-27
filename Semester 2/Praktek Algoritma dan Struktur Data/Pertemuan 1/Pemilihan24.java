import java.util.Scanner;

public class Pemilihan24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        
        System.out.println("========================");
        
        System.out.print("Masukkan Nilai Tugas: ");
        double NilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double NilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double NilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double NilaiUAS = sc.nextDouble();

        System.out.println("========================");
        System.out.println("========================");

        if (NilaiTugas < 0 || NilaiTugas > 100) {
            System.out.println("Nilai Tidak Valid");
        } else if (NilaiKuis < 0 || NilaiKuis > 100) {
            System.out.println("Nilai Tidak Valid");
        } else if (NilaiUTS < 0 || NilaiUTS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else if (NilaiUAS < 0 || NilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double NilaiAkhir = NilaiTugas * 0.2 + NilaiKuis * 0.2 + NilaiUTS * 0.3 + NilaiUAS * 0.3;
            System.out.println("Nilai Akhir : " + NilaiAkhir);
    
            String NilaiHuruf;
            if (80 < NilaiAkhir && NilaiAkhir <= 100) {
                NilaiHuruf = "A";
            } else if (73 < NilaiAkhir && NilaiAkhir <= 80) {
                NilaiHuruf = "B+";
            } else if (65 < NilaiAkhir && NilaiAkhir <= 73) {
                NilaiHuruf = "B";
            } else if (60 < NilaiAkhir && NilaiAkhir <= 65) {
                NilaiHuruf = "C+";
            } else if (50 < NilaiAkhir && NilaiAkhir <= 60) {
                NilaiHuruf = "C";
            } else if (39 < NilaiAkhir && NilaiAkhir <= 50) {
                NilaiHuruf = "D";
            } else {
                NilaiHuruf = "E";
            }
            System.out.println("Nilai Huruf : " + NilaiHuruf);
    
            System.out.println("========================");
    
            String Keterangan;
            if (50 < NilaiAkhir && NilaiAkhir <= 100) {
                Keterangan = "SELAMAT ANDA LULUS YEY";
            } else {
                Keterangan = "TIDAK LULUS";
            }
            System.out.println(Keterangan);
        }
    }
}