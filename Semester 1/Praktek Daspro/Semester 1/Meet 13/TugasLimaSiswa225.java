import java.util.Scanner;

public class TugasLimaSiswa225{

    public static void main(String[] args) {
        int[][] nilai = new int[5][7];
        String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        inputDataNilai(nilai, nama); // input data nilai dari mahasiswa
        tampilSeluruhNilai(nilai, nama); // menampilkan seluruh nilai mahasiswa
        int hariTertinggi = cariHariNilaiTertinggi(nilai);
        System.out.println("");
        System.out.println("Minggu dengan nilai tertinggi adalah : " + "Minggu ke -" + hariTertinggi);   // Cari hari dengan nilai tertinggi
        System.out.println("");
        tampilMahasiswaTertinggi(nilai, nama); // Menampilkan mahasiswa dengan nilai tertinggi
    }

    // Fungsi untuk input data nilai mahasiswa
    public static void inputDataNilai(int[][] nilai, String[] nama) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input data nilai mahasiswa " + nama[i] + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilSeluruhNilai(int[][] nilai, String[] nama) {
        System.out.println("");
        System.out.println("Data nilai mahasiswa:");
        System.out.println("");
        System.out.println("+----+------+---------+---------+---------+---------+---------+---------+---------+");
        System.out.println("| No | Nama | Minggu1 | Minggu2 | Minggu3 | Minggu4 | Minggu5 | Minggu6 | Minggu7 |");
        System.out.println("+----+------+---------+---------+---------+---------+---------+---------+---------+");
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("| %-2d | %-4s |", (i + 1), nama[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf(" %-7d |", nilai[i][j]);
            }
            System.out.println();
        }
        System.out.println("+----+------+---------+---------+---------+---------+---------+---------+---------+");
    }

    // Fungsi untuk mencari hari dengan nilai tertinggi
    public static int cariHariNilaiTertinggi(int[][] nilai) {
        int nilaiTertinggi = 0;
        int hariTertinggi = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    hariTertinggi = j + 1;
                }
            }
        }
        return hariTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    public static void tampilMahasiswaTertinggi(int[][] nilai, String[] nama) {
        int nilaiTertinggi = 0;
        int indexMahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    indexMahasiswaTertinggi = i;
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " + nama[indexMahasiswaTertinggi] + " pada minggu ke-" + mingguTertinggi);  
        System.out.println("");  
        System.out.println("Nilai tertinggi: " + nilaiTertinggi + " pada minggu ke-" + mingguTertinggi);
        System.out.println("");
    }

    // Fungsi untuk mencari hari dengan nilai tertinggi dari keseluruhan mahasiswa
    public static int cariHariTertinggiSemua(int[][] nilai) {
        int[] totalNilaiPerHari = new int[7];

        // Menghitung total nilai per hari dari semua mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilaiPerHari[j] += nilai[i][j];
            }
        }

        // Mencari hari dengan nilai tertinggi dari keseluruhan mahasiswa
        int hariTertinggiSemua = 0;
        int nilaiTertinggiSemua = 0;
        for (int i = 0; i < totalNilaiPerHari.length; i++) {
            if (totalNilaiPerHari[i] > nilaiTertinggiSemua) {
                nilaiTertinggiSemua = totalNilaiPerHari[i];
                hariTertinggiSemua = i + 1;
            }
        }

        return hariTertinggiSemua;
    }
}
