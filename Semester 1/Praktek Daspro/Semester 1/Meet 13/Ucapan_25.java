import java.util.Scanner;
public class Ucapan_25 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tulis nama orang yang ingin anda kasih ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args){
        String nama = PenerimaUcapan();
        System.out.print("Terima kasih " + nama + "\nMay the force be with you");
    }
}