package P7;

import java.util.Scanner;

public class BukuMain24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku24 data = new PencarianBuku24();
        int jumBuku = 5;

        System.out.println("---------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil : ");

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t: ");
            int stock = s.nextInt();

            Buku24 m = new Buku24(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("---------------------------------------------"); 
        System.out.println("---------------------------------------------"); 
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku: ");
        String cari = s1.nextLine();
        System.out.println("----------------------------------------------");
        System.out.println("Data Buku Setelah sorting");
        data.sortBubble();
        data.tampil();
        System.out.println("----------------------------------------------");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        int posisiSeq = data.FindJudulSequential(cari);
        if (data.getJumlahHasil() == 0){
            System.out.println("Data tidak dapat ditemukan");
        } else if (data.getJumlahHasil() == 1) {
            data.TampilPosisi(posisiSeq);
            data.TampilData(posisiSeq);    
        } else {
            System.out.println("Peringatan : Terdapat lebih dari satu hasil judul buku yang anda cari");
        }
        data.TampilPosisi(posisi);
        data.TampilData(posisi);

        System.out.println("----------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        int posisiBinary = data.FindJudulBinary(cari, 0, jumBuku - 1);
        if (posisiBinary != -1){
            data.TampilPosisi(posisiBinary);
            data.TampilData(posisiBinary);
        } else {
            System.out.println("Data tidak dapat ditemukan");
        }
    }
}