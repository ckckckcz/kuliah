import java.text.DecimalFormat;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###"); // sebuah function untuk mengatur dan memformat angka menjadi string sesuai dengan pola tertentu
        DecimalFormat dfPercentage = new DecimalFormat("#.##%"); // sebuah function untuk memformat angka menjadi persentase dengan dua digit desimal setelah koma dan simbol % yang akan ditambahkan diakhir 
        
        System.out.print("Masukkan jenis buku : "); 
        String jenisBuku = input.nextLine().toLowerCase(); // code ini digunakan untuk membaca input dari pengguna sebagai string dan mengubahnya menjadi huruf kecil untuk memudahkan pengolahan / perbandingan lebih lanjut dalam progaram
        System.out.print("Masukkan jumlah buku yang dibeli : ");
        int jumlahBuku = input.nextInt();
        System.out.print("Masukkan harga buku: ");
        double hargaBuku = input.nextDouble();
        double diskon = 0.0;
        
        if (jenisBuku.equals("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07; 
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else if (jumlahBuku <= 3) {
                diskon += 0.01;
            }
        } else if (jumlahBuku > 3 && !jenisBuku.equals("kamus") && !jenisBuku.equals("novel")) { // jadi code ini akan memeriksa tiga kondisi yaitu, jika jumlah buka lebih besar dari 3, jenis buku bukan "kamus",  jenis buku bukan "novel"
            diskon = 0.05;
        }
        
        double totalHarga = TotalHarga(jumlahBuku, hargaBuku, diskon);
        String formattedDiskon = dfPercentage.format(diskon);
        double nilaiDiskonDalamRupiah = DiskonDalamRupiah(jumlahBuku, hargaBuku, diskon);
        
        System.out.println("Jumlah diskon yang diterima: " + formattedDiskon);
        System.out.println("Nilai diskon dalam rupiah: Rp " + df.format(nilaiDiskonDalamRupiah));
        System.out.println("Total yang harus dibayar: Rp " + df.format(totalHarga));
        
        input.close();
    }
    
    public static double TotalHarga(int jumlahBuku, double hargaBuku, double diskon) {
        double totalHarga = jumlahBuku * hargaBuku;
        totalHarga -= totalHarga * diskon;
        return totalHarga;
    }

    // untuk code diatas itu digunakan untuk menghitung total harga buku berdasarkan jumlah buku, harga buku, dan diskon yang diberikan oleh user, kemudian dikembalikan total harga yang sudah dihitung
    
    public static double DiskonDalamRupiah(int jumlahBuku, double hargaBuku, double diskon) {
        double totalDiskon = jumlahBuku * hargaBuku * diskon;
        return totalDiskon;
    }

    // jadi code ini digunakan untuk menghitung total diskon dalam rupiah yang diberikan berdasarkan jumlah buku, harga buku, dan persentase diskon yang diberikan
}
