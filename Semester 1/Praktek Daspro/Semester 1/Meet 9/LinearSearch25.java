import java.util.Scanner;

public class LinearSearch25 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);

        // Deklarasi variabel
        int[] arrayInt;
        int inputArray;
        int inputKey;
        int hasil = -1;

        // Input nilai ke arrayInt
        System.out.print("Masukkan jumlah elemen array: ");
        inputArray = scan12.nextInt();
        arrayInt = new int[inputArray];

        // Input nilai pada arrayInt sejumlah banyak elemen yang telah diinput sebelumnya
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            arrayInt[i] = scan12.nextInt();
        }

        // Input nilai key yang ingin dicari
        System.out.print("Masukkan key yang ingin anda cari: ");
        inputKey = scan12.nextInt();

        // Proses pencarian indeks nilai yang ingin dicari
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == inputKey) {
                hasil = i;
                System.out.println("Key yang anda cari ada di posisi indeks ke-" + hasil);
                break; // Hentikan loop setelah kunci ditemukan
            }
        }

        // Cek apakah kunci ditemukan
        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        }
    }
}