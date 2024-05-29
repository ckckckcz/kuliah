package tugas1;

import java.util.Scanner;

public class VaksinMain {
    public static void main(String[] args) throws Exception {
        Vaksin antrian = new Vaksin();
        Scanner sc = new Scanner(System.in);
        int nomor;
        String nama;
        int pilih;

        do {
            System.out.println("=================================");
            System.out.println("| PENGANTRI VAKSIN EXTRAVAGANZA |");
            System.out.println("=================================");
            System.out.println("1. tambah data penerima vaskin");
            System.out.println("2. hapus data pengantre vaksin");
            System.out.println("3. daftar penerima vaksin");
            System.out.println("4. keluar");
            System.out.println("=================================");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("masukkan data penerima vaksin");
                    System.out.println("---------------------------------");
                    System.out.print("nomor antrian: ");
                    nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("nama penerima: ");
                    nama = sc.nextLine();
                    antrian.addLast(nomor, nama);
                    break;

                case 2:
                    System.out.println("---------------------------------");
                    antrian.removeFirst();
                    System.out.println("---------------------------------");
                    System.out.println("===========================");
                    System.out.println("| daftar pengantri vaksin |");
                    System.out.println("===========================");
                    System.out.println("|nomor\t|nama\t|");
                    antrian.print();
                    System.out.println("Sisa Antrian: " + antrian.size());
                    break;

                case 3:
                System.out.println("===========================");
                System.out.println("| daftar pengantri vaksin |");
                System.out.println("===========================");
                    System.out.println("|nomor\t|nama\t|");
                    antrian.print();
                    System.out.println("Sisa Antrian: " + antrian.size());

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);

    }

}