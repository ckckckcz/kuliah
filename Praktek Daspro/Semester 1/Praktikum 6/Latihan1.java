import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input25.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input25.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input25.nextInt();
        int terbesar;

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 >= bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
