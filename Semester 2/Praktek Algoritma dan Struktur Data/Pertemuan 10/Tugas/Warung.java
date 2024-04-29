package Tugas;
import java.util.Scanner;
public class Warung {

    public static void menu(){
        System.out.println("1. Daftar ke antrian");
        System.out.println("2. Lihat daftar pembeli");
        System.out.println("3. Lihat pembeli di paling depan");
        System.out.println("4. Lihat pembeli di paling belakang");
        System.out.println("5. Cari pembeli di antrian");
        System.out.println("6. Keluar");
        System.out.println("---------------------------------------------");
        System.out.print("Pilih menu: ");
    }
    public static void main(String[] args) {
        Queue antrian = new Queue(8);
        Scanner sc = new Scanner(System.in);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama anda : ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("Masukkan No.Hp anda :  ");
                    int noHP = sc.nextInt();
                    Pembeli pembeli = new Pembeli(nama, noHP);
                    antrian.enqueue(pembeli);
                    System.out.println("---------------------------------------------");
                    System.out.println("Silahkan menunggu di antrian anda ! ");
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    antrian.daftarPembeli();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    sc.nextLine();
                    String cariNama = sc.nextLine();
                    antrian.peekPosition(cariNama);
                    break;
                case 6:
                    System.out.println("Terima kasih telah mengunjungi warung pecel kami ! ");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
