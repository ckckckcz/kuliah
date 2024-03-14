package Pertemuan4.Minggu5;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.print("Masukkan jumlah elemen yang dihitung = ");
        int element = sc.nextInt();

        Pangkat[] png = new Pangkat[element];
        for (int i = 0; i < element; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan = ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat = ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilih algoritma yang digunakan: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i=0; i <element; i++) {
                    System.out.println("Hasil dari perhitungan faktorial menggunakan Brute Force adalah " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat)) ;
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i=0; i <element; i++) {
                    System.out.println("Hasil dari perhitungan faktorial menggunakan Divide and Conquer adalah " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)) ;
                }
                break;
            default:
                System.out.println("Pilihan anda tidak diketahui");
                break;
        }
    }
}