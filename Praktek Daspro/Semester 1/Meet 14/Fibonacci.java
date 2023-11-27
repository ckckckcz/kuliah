import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = sc.nextInt();

        int[] jmlMarmut = hitungPasanganMarmut(bulan);

        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah " + jmlMarmut[0]);
        System.out.println("Jumlah marmut produktif pada bulan ke-" + bulan + " adalah " + jmlMarmut[1]);
        System.out.println("Jumlah marmut belum produktif pada bulan ke-" + bulan + " adalah " + jmlMarmut[2]);
    }

    public static int[] hitungPasanganMarmut(int bulan) {
        int[] hasil = new int[3];
        if (bulan <= 2) {
            hasil[0] = 1;
            hasil[1] = 0; 
            hasil[2] = 1; 
            return hasil;
        }

        int[] marmutSebelumnya = hitungPasanganMarmut(bulan - 1);
        int totalPasangan = marmutSebelumnya[0] + marmutSebelumnya[2]; 
        int jumlahProduktif = marmutSebelumnya[2]; 
        hasil[0] = totalPasangan;
        hasil[1] = jumlahProduktif;
        hasil[2] = totalPasangan - jumlahProduktif;
        return hasil;
    }
}