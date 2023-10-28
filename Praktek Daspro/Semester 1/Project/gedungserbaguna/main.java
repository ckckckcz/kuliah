public class main {
    public static void main(String[] args) {
        double totalBelanjaSinta = 500000; // Total belanja Sinta dalam rupiah
        double diskon = 0; // Inisialisasi nilai diskon
        
        // Cek aturan diskon
        if (totalBelanjaSinta <= 500000) {
            diskon = 0; // Tidak ada diskon
        } else if (totalBelanjaSinta <= 750000) {
            diskon = 0.10; // Diskon 10%
        } else if (totalBelanjaSinta <= 1000000) {
            diskon = 0.25; // Diskon 25%
        } else {
            diskon = 0.35; // Diskon 35%
        }
        
        // Hitung jumlah yang harus dibayar oleh Sinta setelah diskon
        double jumlahYangHarusDibayar = totalBelanjaSinta - (totalBelanjaSinta * diskon);
        
        System.out.println("Total belanja Sinta: Rp. " + totalBelanjaSinta);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Jumlah yang harus dibayar oleh Sinta: Rp. " + jumlahYangHarusDibayar);
    }
}
