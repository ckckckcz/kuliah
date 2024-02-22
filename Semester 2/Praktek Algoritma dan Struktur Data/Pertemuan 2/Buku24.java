public class Buku24 {
    public Buku24(){

    }
    public Buku24(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual (int jml){
        stok -= jml;
    }

    void restock (int jml){
        stok += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(int jmlTerjual){
        return harga * jmlTerjual;
    }

    int hitungDiskon(int hargaTotal){
        if (hargaTotal > 150000){
            return hargaTotal * 12 /100;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return hargaTotal * 5 / 100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int hargaTotal, int diskon){
        return hargaTotal - diskon;
    }
    
    public class BukuMain24 {
        String judul, pengarang;
        int halaman, stok, harga;
        void tampilInformasi(){
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Jumlah Halaman : " + halaman);
            System.out.println("Sisa stok : " + stok);
            System.out.println("Harga : Rp " + harga);
        }
    
        void terjual (int jml){
            stok -= jml;
        }
    
        void restock (int jml){
            stok += jml;
        }
    
        void gantiHarga (int hrg){
            harga = hrg;
        }
    }
    
}