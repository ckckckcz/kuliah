package Pertemuan3;
import java.util.Scanner;
public class ArrayObjects {
    public int panjang,lebar;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Persegi Panjang : ");
        PersegiPanjang[] ppArray = new PersegiPanjang[sc.nextInt()];

        for(int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}