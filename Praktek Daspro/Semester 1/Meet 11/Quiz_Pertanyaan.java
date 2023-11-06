import java.util.Random;
import java.util.Scanner;

public class Quiz_Pertanyaan {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka 1-10 : ");
                int answer = sc.nextInt();
                sc.nextLine();

                if (answer == number) {
                    System.out.println("Selamat, Anda benar!");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Angka tebakan terlalu kecil. Coba lagi.");
                } else {
                    System.out.println("Angka tebakan terlalu besar. Coba lagi.");
                }
            } while (!success);

            System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
