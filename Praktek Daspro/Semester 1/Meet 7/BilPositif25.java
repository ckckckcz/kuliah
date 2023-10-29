import java.util.Scanner;
public class BilPositif25 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int jumlah = 0, counter = 0, angka;
        float rata = 0;
        do {
            System.out.println("Masukkan interger positif (-1 untuk berhasil) : ");
            angka = sc.nextInt();
            if (angka >= 0) {
                jumlah  += angka;
                ++counter;
            }
        }while (angka != -1);
        rata = jumlah / counter;
        System.out.printf("Jumlah dari %d angka adalah %d\n", counter, jumlah);
        System.out.printf("Jumlah dari %d angka adalah %.3f\n", counter, rata);
    }
    
}