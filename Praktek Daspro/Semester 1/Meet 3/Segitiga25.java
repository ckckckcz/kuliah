import java.util.Scanner;

public class Segitiga25 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.println("Masukkan Alas : ");
        alas = sc.nextInt();
        System.out.println("Masukkan Tinggi :");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga: " + luas);

    }
}
