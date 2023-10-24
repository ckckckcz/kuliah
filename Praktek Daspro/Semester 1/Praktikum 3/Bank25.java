import java.util.Scanner;

public class Bank25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tabungan awal (Rupiah): ");
        int jumlahTabunganAwal = sc.nextInt();
        System.out.print("Masukkan lama menabung (tahun): ");
        int lamaMenabung = sc.nextInt();
        double prosentaseBunga = 0.02;
        double bunga = lamaMenabung * prosentaseBunga * jumlahTabunganAwal;
        double jumlahTabunganAkhir = jumlahTabunganAwal + bunga;
        System.out.println("Bunga yang diperoleh: Rp " + bunga);
        System.out.println("Jumlah tabungan akhir: Rp " + jumlahTabunganAkhir);
        
        sc.close();
    }
}
