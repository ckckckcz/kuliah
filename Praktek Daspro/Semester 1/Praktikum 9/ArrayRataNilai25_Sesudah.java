import java.util.Scanner;

public class ArrayRataNilai25_Sesudah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        double rataLulus = 0;
        double rataTidakLulus = 0;
        int lulusCount = 0;
        int tidakLulusCount = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulusCount++;
                rataLulus += nilaiMhs[i];
            } else {
                tidakLulusCount++;
                rataTidakLulus += nilaiMhs[i];
            }
        }

        if (lulusCount > 0) {
            rataLulus /= lulusCount;
        }

        if (tidakLulusCount > 0) {
            rataTidakLulus /= tidakLulusCount;
        }

        System.out.println("Rata-rata nilai lulus : " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus : " + rataTidakLulus);
    }
}
