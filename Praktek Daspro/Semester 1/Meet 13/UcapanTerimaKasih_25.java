import java.util.Scanner;
public class UcapanTerimaKasih_25 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}