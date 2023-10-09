import java.util.Scanner;

public class ForKelipatan25_Sesudah{
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0; 
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input25.nextInt();
        
        if (kelipatan < 1 || kelipatan > 9) {
            System.out.println("Masukkan bilangan kelipatan antara 1 dan 9.");
            return;
        }

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}
