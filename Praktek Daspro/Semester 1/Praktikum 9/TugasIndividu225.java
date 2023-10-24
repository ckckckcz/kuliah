public class TugasIndividu225{
    public static void main(String[] args) {
        int jumlahElemen = 10;
        int[] arr = new int[jumlahElemen];
        // Loop untuk mengisi array dengan nilai tertentu (contoh: isi dengan indeks)
        for (int i = 0; i < jumlahElemen; i++) {
            arr[i] = i + 1; // Mengisi dengan nilai 1 hingga 10
        }
        // Menampilkan isi array secara terbalik
        for (int i = jumlahElemen - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
