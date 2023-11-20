import java.util.Scanner;

public class TugasLimaSiswa325 {

    private static Scanner input;

    public static void main(String[] args) {
        // Deklarasi variabel
        int[][] nilai;
        String[] nama;
        int jumlahMahasiswa;
        int jumlahTugas;

        input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        // Input jumlah tugas
        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = input.nextInt();

        // Inisialisasi array nilai dan nama
        nilai = new int[jumlahMahasiswa][jumlahTugas];
        nama = new String[jumlahMahasiswa];

        // Input data nilai mahasiswa
        inputDataNilai(nilai, nama);

        // Tampilkan seluruh nilai mahasiswa
        tampilSeluruhNilai(nilai, nama);

        input.close(); // Close scanner after usage
    }

    // Fungsi untuk input data nilai mahasiswa
    public static void inputDataNilai(int[][] nilai, String[] nama) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input data nilai mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai tugas ke-" + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilSeluruhNilai(int[][] nilai, String[] nama) {
        System.out.println("Data nilai mahasiswa:");
        System.out.println("No | Nama | Tugas 1 | Tugas 2 | Tugas 3 | Tugas 4 | Tugas 5 | Tugas 6 | Tugas 7");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print((i + 1) + " | " + nama[i] + " | ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
