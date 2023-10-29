import java.util.Scanner;

public class Latihan125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa = 30;
        String namaMahasiswa;
        String jenisKelamin;

        int i = 0;
        do {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P) mahasiswa ke-" + (i + 1) + ": ");
            jenisKelamin = scanner.nextLine().toUpperCase();
            if (jenisKelamin.equalsIgnoreCase("p")) {
                System.out.println("Mahasiswa perempuan dengan nama " + namaMahasiswa);
            }
            i++; 
        } while (i < jumlahMahasiswa); 

    }
}