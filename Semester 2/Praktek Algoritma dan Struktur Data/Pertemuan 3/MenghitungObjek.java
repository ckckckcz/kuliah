package Pertemuan3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MenghitungObjek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("==============================");
        System.out.print("Masukkan Value Kerucut: ");
        
        Kerucut[] krArray = new Kerucut[sc.nextInt()];

        for(int i=0; i<krArray.length; i++) {

            krArray[i] = new Kerucut();
            System.out.println("\nKerucut ke-" + (i+1));
            System.out.print("Masukkan jari jari: ");
            krArray[i].jarijari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            krArray[i].sisiMiringKerucut = sc.nextInt();
    
        }

        System.out.println("==============================");

        System.out.print("\nMasukkan Value Limas Segi Empat: ");
        LimasSegiEmpat[] lseArray = new LimasSegiEmpat[sc.nextInt()];

        for(int i=0; i<lseArray.length; i++) {

            lseArray[i] = new LimasSegiEmpat();
            System.out.println("\nLimas Segi Empat ke-" + (i+1));
            System.out.print("Masukkan sisi alas: ");
            lseArray[i].panjangSisiAlas = sc.nextInt();
            System.out.print("Masukkan tinggi limas: ");
            lseArray[i].tinggiLimas = sc.nextInt();
    
        }

        System.out.println("==============================");

        System.out.print("\nMasukkan Value Bola: ");
        Bola[] blArray = new Bola[sc.nextInt()];

        for(int i=0; i<blArray.length; i++) {

            blArray[i] = new Bola();
            System.out.println("\nBola ke-" + (i+1));
            System.out.print("Masukkan jari jari: ");
            blArray[i].jarijari = sc.nextInt();
    
        }

        System.out.println("==============================");
        
        for(int i=0; i<krArray.length; i++) {
            System.out.println("\nKerucut ke-" + (i+1));
            System.out.println("Luas Permukaan: " + df.format(krArray[i].hitungLuasPermukaan()) + ", Volume: " + df.format(krArray[i].hitungVolume()));
        }

        for(int i=0; i<lseArray.length; i++) {
            System.out.println("\nLimas Segi Empat ke-" + (i+1));
            System.out.println("Luas Permukaan: " + df.format(lseArray[i].hitungLuasPermukaan()) + ", Volume: " + df.format(lseArray[i].hitungVolume()));
        }

        for(int i=0; i<blArray.length; i++) {
            System.out.println("\nBola ke-" + (i+1));
            System.out.println("Luas Permukaan: " + df.format(blArray[i].hitungLuasPermukaan()) + ", Volume: " + df.format(blArray[i].hitungVolume()));
        }

        sc.close();
    }
}