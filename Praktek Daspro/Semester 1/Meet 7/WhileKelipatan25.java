import java.util.Scanner;

public class WhileKelipatan25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0; 
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input25.nextInt();
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++; 
        }

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}
