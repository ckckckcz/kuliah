import java.util.Scanner; // merupakan fungsi diperlukan untuk mendapatkan input dari pengguna


public class HitungIP25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // digunakan untuk membaca input dari pengguna.

        System.out.print("Masukkan nama mahasiswa: "); // untuk mencetak pesan ke layar meminta pengguna untuk memasukkan nama mahasiswa.
        String namaMahasiswa = input.nextLine();

        int jumlahMataKuliah = 0;
        int totalSks = 0;
        double totalNilai = 0.0;
        int mataKuliahPerbaikan = 0;
        // jadi fungsi ini merupakan deklarasi variabel yang akan digunakan untuk menghitung IP dan jumlah mata kuliah perbaikan

        while (jumlahMataKuliah < 4) {
            System.out.print("Nama mata kuliah: ");
            String namaMataKuliah = input.next();

            System.out.print("Indeks nilai (A, B+, B, C+, C, D, E): ");
            String indeksNilai = input.next();
            double nilai = konversiIndeksNilai(indeksNilai);

            System.out.print("Jumlah SKS: ");
            int sks = input.nextInt();

            totalSks += sks;
            totalNilai += nilai * sks;
            jumlahMataKuliah++;

            if (indeksNilai.equals("D") || indeksNilai.equals("E")) {
                mataKuliahPerbaikan++;
            }

            System.out.print("Lanjut input nilai? (y/n): ");
            String lanjut = input.next().toLowerCase();
            if (!lanjut.equals("y")) {
                break;
            }
        }

        double ip = totalSks > 0 ? totalNilai / totalSks : 0.0;
        System.out.println("------------------ HASIL PERHITUNGAN IP ---------------------");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " +  String.format("%.2f", ip));
        System.out.println("Total Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Jumlah Mata Kuliah Perbaikan/Remidi: " + mataKuliahPerbaikan);
        System.out.println("-------------------------------------------------------------");

        input.close();
    }

    public static double konversiIndeksNilai(String indeksNilai) {
        switch (indeksNilai) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0; // Nilai default jika tidak valid
        }
    }
}
