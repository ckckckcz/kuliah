package Postfix;
import java.util.Scanner;

public class PostfixMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix24 post = new Postfix24(total); // Perbaikan di sini
        P = post.konversi(Q); // Perbaikan di sini
        System.out.println("Postfix : " + P);
    }
}