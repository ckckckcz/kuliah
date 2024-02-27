import java.util.Scanner;

public class Tugas224 {
    
    static Scanner sc04 = new Scanner(System.in);

    static double s;
    static double t;
    static double v;
    public static void main(String[] args) {
        MenuUtama();
    }

    private static void MenuUtama() {

        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilihan: ");
        
        int pilihan = sc04.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Jarak: ");
                s = sc04.nextInt();
                System.out.print("Masukkan Waktu: ");
                t = sc04.nextInt();
                System.out.println(HitungKecepatan(s, t) + "Km/jam");
                break;

            case 2:
                System.out.print("Masukkan Kecepatan: ");
                v = sc04.nextInt();
                System.out.print("Masukkan Waktu: ");
                t = sc04.nextInt();
                System.out.println(HitungJarak(v, t) + "Km");
                break;

            case 3:
                System.out.print("Masukkan Jarak: ");
                s = sc04.nextInt();
                System.out.print("Masukkan Kecepatan: ");
                v = sc04.nextInt();
                System.out.println(HitungWaktu(s, v) + " Jam");
                break;

            default:
                System.out.println("Pilihan anda tidak diketahui !");;
        }
    }

    private static double HitungKecepatan(double s, double t) {
        return s/t;
    }

    private static double HitungJarak(double v, double t) {
        return v*t;
    }

    private static double HitungWaktu(double s, double v) {
        return s/v;
    }

}