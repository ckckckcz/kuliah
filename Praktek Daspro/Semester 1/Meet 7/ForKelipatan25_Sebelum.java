import java.util.Scanner;

public class ForKelipatan25_Sebelum {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0, rataRata=0; 
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input25.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                rataRata = total / counter;
            }
        }

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.println("rata-rata nya adalah : " + rataRata);
    }
}
