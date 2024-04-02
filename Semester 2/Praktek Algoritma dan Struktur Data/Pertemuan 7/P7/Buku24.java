package P7;
public class Buku24 {
    int tahunTerbit, stock;
    String judulBuku, pengarang, kodeBuku;
    public Buku24(String kodeBuku, String judulBuku, int tahunTerbit,String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    public void tampilDataBuku24(){
        System.out.println("================================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " +judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);
    }
}