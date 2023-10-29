import java.util.Scanner;
public class Gaji25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotalGaji;
        System.out.println("Masukkan gaji anda : ");
        int gaji = sc.nextInt();
        System.out.println("Masukkan besaran potongan gaji : ");
        int potGaji=sc.nextInt();
        System.out.println("Masukkan jumlah hari masuk kerja anda : ");
        jmlMasuk=sc.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda : ");
        jmlTdkMasuk=sc.nextInt();
        TotalGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah : " + TotalGaji);
    }
}