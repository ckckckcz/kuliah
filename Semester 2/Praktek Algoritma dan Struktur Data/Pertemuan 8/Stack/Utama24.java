package Stack;
import java.util.Scanner;

public class Utama24 {
    public static void main(String[] args) {
        // Gudang24 gudang = new Gudang24(7);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gedung : ");
        int kapasitasGedung = sc.nextInt();
        sc.nextLine();
        Gudang24 gudang = new Gudang24(kapasitasGedung);

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Melihat barang paling atas ");
            System.out.println("5. Melihat barana paling bawah");
            System.out.println("6. Mencari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
            case 1:
                System.out.print("Masukkan kode barang: ");
                int kode = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan nama barang: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan nama kategori: ");
                String kategori = sc.nextLine();
                Barang24 barangBaru = new Barang24(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;
            case 2:
                gudang.ambilBarang();
                break;
            case 3:
                gudang.tampilkanBarang();
                break;
            case 4: 
                if (!gudang.cekKosong()){
                    System.out.println("Barang paling atas : " + gudang.tumpukan[gudang.top].nama);
                } else {
                    System.out.println("Tumpukan barang di gudang kosong");
                }
                break;
            case 5:
                gudang.lihatBarangBawah();
                break;
            case 6: 
                System.out.print("Input kode barang atau nama barang yang ingin anda cari : ");
                String keyword = sc.nextLine();
                gudang.mencariBarang(keyword);
                break;
            case 7:
                break;
            default:
                System.out.println("Pilihan anda tidak valid");
            }
        }
    }
}
