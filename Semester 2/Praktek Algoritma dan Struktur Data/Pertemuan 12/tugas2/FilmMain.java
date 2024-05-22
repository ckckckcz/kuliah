package tugas2;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) throws Exception {
        Film dataFilm = new Film();
        Scanner sc = new Scanner(System.in);
        int id, indexKe;
        String judul;
        double rating;
        int pilih;

        do {
            System.out.println("===========================================");
            System.out.println("|          DATA FILM LAYAR LEBAR          |");
            System.out.println("===========================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data index tertentu");
            System.out.println("4. Hapus data  awal");
            System.out.println("5. Hapus data akhir");
            System.out.println("6. Hapus data index tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari film berdasarkan ID");
            System.out.println("9. Urut film berdasarkan rating -DESC");
            System.out.println("10. Exit");
            System.out.println("===========================================");
            System.out.print(" Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("===========================================");
                    System.out.println(" Masukan data film di Awal ");
                    System.out.println("===========================================");
                    System.out.println("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.println("Rating Film   : ");
                    rating = sc.nextDouble();
                    sc.nextLine();
                    dataFilm.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.println("===========================================");
                    System.out.println(" Menambahkan data film di AKHIR");
                    System.out.println("===========================================");
                    System.out.println("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.println("Rating Film   : ");
                    rating = sc.nextDouble();
                    sc.nextLine();
                    dataFilm.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.println("===========================================");
                    System.out.println(" Menambahkan data di INDEX TERTENTU");
                    System.out.println("===========================================");
                    System.out.print("Tambah di index ke-: ");
                    indexKe = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.println("Rating Film   : ");
                    rating = sc.nextDouble();
                    sc.nextLine();
                    dataFilm.add(indexKe, id, judul, rating);
                    
                    break;
                case 4:
                    System.out.println("===========================================");
                    System.out.println(" Menghapus data di AWAL");
                    System.out.println("===========================================");
                    System.out.println("[INFO:] Film _" + dataFilm.getFirst() + "_ telah dihapus.");
                    dataFilm.removeFirst();
                    break;
                case 5:
                    System.out.println("===========================================");
                    System.out.println(" Menghapus data di AKHIR");
                    System.out.println("===========================================");
                    System.out.println("[INFO:] Film _" + dataFilm.getLast() + "_ telah dihapus.");
                    dataFilm.removeLast();
                    break;
                case 6:
                    System.out.println("===========================================");
                    System.out.println(" Menghapus data di INDEX TERTENTU");
                    System.out.println("===========================================");
                    System.out.print("Pilih index film yang ingin dihapus: ");
                    indexKe = sc.nextInt();
                    sc.nextLine();
                    System.out.println("[INFO:] Film _" + dataFilm.get(indexKe) + "_ telah dihapus.");
                    dataFilm.remove(indexKe);
                    break;
                case 7:
                    System.out.println("===========================================");
                    System.out.println(" Cetak Data");
                    System.out.println("===========================================");
                    dataFilm.print();
                    break;
                case 8:
                    System.out.println("===========================================");
                    System.out.println(" Cari Film berdasarkan ID");
                    System.out.println("===========================================");
                    System.out.print("Masukkan ID Film yang ingin dicari: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    dataFilm.findFilm(id);
                    break;
                case 9:
                    System.out.println("===========================================");
                    System.out.println(" Urutkan Data Film (descending)");
                    System.out.println("===========================================");
                  
                    System.out.println("Data Film sebelum diurutkan:");
                    dataFilm.print();
        
                    dataFilm.sortFilmByRating();
                    System.out.println("\nData Film setelah diurutkan berdasarkan rating:");
                    dataFilm.print();
                    break;
                    
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih ==7 || pilih == 8 || pilih == 9);

    }
}