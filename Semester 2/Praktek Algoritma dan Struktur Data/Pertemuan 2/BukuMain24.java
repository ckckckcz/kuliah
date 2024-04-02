import P7.Buku24;

public class BukuMain24 {

    public static void main(String[] args) {
        Buku24 bk1 = new Buku24();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        //--------------------------------------------------------------------------------------------------//

        Buku24 bk2 = new Buku24("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        //--------------------------------------------------------------------------------------------------//
        
        Buku24 bkRio = new Buku24("Yakin gamau masuk Polinema ?", "Rio", 200, 40, 5000);
        bkRio.terjual(50);
        bkRio.tampilInformasi();
        
        // Menghitung harga total, diskon, dan harga bayar
        int hargaTotal = bkRio.hitungHargaTotal(50);
        int diskon = bkRio.hitungDiskon(hargaTotal);
        int hargaBayar = bkRio.hitungHargaBayar(hargaTotal, diskon);
        
        // Menampilkan hasil perhitungan
        System.out.println("Harga Total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga Bayar: Rp " + hargaBayar);

        //--------------------------------------------------------------------------------------------------//
    }
}
