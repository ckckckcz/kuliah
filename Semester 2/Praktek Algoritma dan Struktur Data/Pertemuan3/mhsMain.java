package Pertemuan3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class mhsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        mhs[] mahasiswa = new mhs[3];

        // Kode dibawah adalah input value data mahasiswa
        for (int i = 0; i < 3; i++){
            mahasiswa[i] = new mhs();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            mahasiswa[i].nama = scanner.nextLine();
            System.out.print("Masukkan nim: ");
            mahasiswa[i].nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            mahasiswa[i].jenisKelamin = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Masukkan IPK: ");
            mahasiswa[i].ipk = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("");
        }

        // Kode dibawah akan menampilkan informasi input value dari kode diatas
        for (int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NIM : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK : " + mahasiswa[i].ipk);
            System.out.println("");
        }

        // Kode yang ada dibawah ini untuk menghitung dan juga menampilkan rata-rata IPK
        double rataIPK = menghitungRataIPK(mahasiswa);
        System.out.println("-----------------------------");
        System.out.println("Rata-Rata IPK : " + df.format(rataIPK));
        System.out.println("-----------------------------");
        System.out.println("");

        mhs mahasiswaIPKTerbesar = mencariIPKTerbesar(mahasiswa);
        System.out.println("Data Mahasiswa dengan IPK tertinggiS : ");
        System.out.println("Nama : " + mahasiswaIPKTerbesar.nama);
        System.out.println("NIM : " + mahasiswaIPKTerbesar.nim);
        System.out.println("Jenis Kelamin : " + mahasiswaIPKTerbesar.jenisKelamin);
        System.out.println("IPK : " + mahasiswaIPKTerbesar.ipk);

        scanner.close();
    }

    public static double menghitungRataIPK(mhs[] mahasiswa){
        double totalIPK = 0;
        for (int i = 0; i < mahasiswa.length; i++){
            totalIPK += mahasiswa[i].ipk;
        }
        return totalIPK / mahasiswa.length;
    }

    public static mhs mencariIPKTerbesar(mhs[] mahasiswa){
        mhs mahasiswaIPKTerbesar = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++){
            if (mahasiswa[i].ipk > mahasiswaIPKTerbesar.ipk) {
                mahasiswaIPKTerbesar = mahasiswa[i];
            }
        }
        return mahasiswaIPKTerbesar;
    }
}
