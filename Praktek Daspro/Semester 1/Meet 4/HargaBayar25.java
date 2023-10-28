import java.util.Scanner;
public class HargaBayar25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int harga, jumlah, jumlahHalaman;
        double diskon, total, bayar, jmlDis;
        String merkBuku;
        System.out.println("Masukkan merek buku yang anda beli : ");
        merkBuku=sc.nextLine();
        System.out.println("Masukkan jumlah halaman pada buku : ");
        jumlahHalaman=sc.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=sc.nextInt();
        System.out.println("Masukkan Jumlah barang yang anda beli");
        jumlah=sc.nextInt();
        System.out.println("Masukkan discount : ");
        diskon=sc.nextDouble();
        total=harga*jumlah;
        jmlDis=total*diskon;
        bayar=total-jmlDis;
        System.out.println("Merek buku : " + merkBuku);
        System.out.println("Jumlah Halaman pada buku : " + jumlahHalaman);
        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus anda bayar : " + bayar);
    }
}