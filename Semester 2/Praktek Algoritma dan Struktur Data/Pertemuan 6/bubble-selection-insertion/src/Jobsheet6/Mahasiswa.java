package Jobsheet6;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    public Mahasiswa(String n, int t, int u, double i){
        nama = n;
        umur = u;
        thnMasuk = t;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Masuk : " + thnMasuk);
        System.out.println("umur : " + umur);
        System.out.println("IPK : " +ipk);
    }
}
