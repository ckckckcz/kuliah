import java.util.Scanner;
public class Tugas125 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner (System.in);

        int jml_bilangan, bilangan, total = 0, nilaiTertinggi = Integer.MIN_VALUE, nilaiTerendah = Integer.MAX_VALUE;
        int [] array_bil; 

        System.out.print("Berapa bilangan yang ingin Anda input?");
        jml_bilangan = scan12.nextInt();
        array_bil = new int[jml_bilangan];

        for (int i=0; i < array_bil.length; i++) {
            System.out.print("Masukkan bilangan ke-:"+(i+1)+": ");
            bilangan = scan12.nextInt();
            array_bil[i] = bilangan;

            total += bilangan; 

            // Pengidentifikasian apakah bilangan tersebut nilai tertinggi atau terendah
            if (bilangan > nilaiTertinggi) {
                nilaiTertinggi = bilangan;
            } else if (bilangan < nilaiTerendah) {
                nilaiTerendah = bilangan;
            }
        }

        double rataRata = (double) total / jml_bilangan;
        // Menghitung nilai tertinggi dari data yang diinput
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);

        // Menghitung nilai terendah dari data yang diinput
        System.out.println("Nilai terendah: " + nilaiTerendah);

        // Menghitung nilai rata-rata dari data yang diinput
        System.out.println("Rata-rata: " + rataRata);
    }
}