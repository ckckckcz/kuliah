import java.util.Scanner;

public class TugasLimaSiswa225 {

    public static void main(String[] args) {
        int[][] nilai = new int[5][7];
        String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        inputDataNilai(nilai, nama); // input data nilai dari mahasiswa
        tampilSeluruhNilai(nilai, nama); // menampilkan seluruh nilai mahasiswa
        int hariTertinggi = cariHariNilaiTertinggi(nilai);
        System.out.println("Hari dengan nilai tertinggi: " + hariTertinggi);   // Cari hari dengan nilai tertinggi
        tampilMahasiswaY(nilai, nama);
        tampilMahasiswaTertinggi(nilai, nama); // Menampilkan mahasiswa dengan nilai tertinggi
    }

    // Fungsi untuk input data nilai mahasiswa
    public static void inputDataNilai(int[][] nilai, String[] nama) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input data nilai mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilSeluruhNilai(int[][] nilai, String[] nama) {
        System.out.println("Data nilai mahasiswa:");
        System.out.println("No | Nama | Minggu 1 | Minggu 2 | Minggu 3 | Minggu 4 | Minggu 5 | Minggu 6 | Minggu 7");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print((i + 1) + " | " + nama[i] + " | ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " | ");
            }
            System.out.println();
        }
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

    // Fungsi untuk menampilkan mahasiswa y
    public static void tampilMahasiswaY(int[][] nilai, String[] nama) {
        System.out.println("Mahasiswa y:");
        System.out.println("No | Nama | Minggu 1 | Minggu 2 | Minggu 3 | Minggu 4 | Minggu 5 | Minggu 6 | Minggu 7");
        for (int i = 0; i < nilai.length; i++) {
            if (nama[i].equals("Yani")) {
                System.out.print((i + 1) + " | " + nama[i] + " | ");
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print(nilai[i][j] + " | ");
                }
                System.out.println();
            }
        }
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

        System.out.println("Mahasiswa dengan nilai tertinggi:");
        System.out.println("Nama: " + nama[indexMahasiswaTertinggi]);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi + " pada minggu ke-" + mingguTertinggi);
    }
}
    