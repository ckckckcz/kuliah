import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Jumlah pemesanan: ");
        int jumlahPengunjung = sc.nextInt();

        System.out.print("Harga per gedung: ");
        double hargaGedung = sc.nextDouble();

        System.out.print("Biaya operasional bulanan: ");
        double biayaOperasional = sc.nextDouble();

        System.out.print("Pendapatan dari penyewaan fasilitas :");
        double pendapatanPenyewaan = sc.nextDouble();

        // Proses
        double totalPendapatanSewa = jumlahPengunjung * hargaGedung;
        double totalPengeluaran = biayaOperasional;
        // Output
        System.out.println("Total pendapatan dari penjualan tiket masuk: " + totalPendapatanSewa);
        System.out.println("Total pendapatan dari penyewaan fasilitas: " + pendapatanPenyewaan);
        System.out.println("Total pengeluaran bulanan: " + totalPengeluaran);
        sc.close();
    }
}
