import java.util.Scanner;

public class Kubus25 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisiKubus = input.nextInt();

        int volume = hitungVolume(sisiKubus);
        int luasPermukaan = hitungLuasPermukaan(sisiKubus);

        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);

        input.close();
    }
}
