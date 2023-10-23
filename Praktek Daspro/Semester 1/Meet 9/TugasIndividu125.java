public class TugasIndividu125 {
    public static void main(String[] args) {
        // Fungsi ini menentukan jumlah elemen yang ingin kita miliki
        int jumlahElemen = 60;
        // Kemudian array dengan jumlah elemen yang telah ditentukan
        int[] arr = new int[jumlahElemen];
        // Melakukan fungsi loop untuk mengisi array dari 1 hingga 60
        for (int i = 1; i <= jumlahElemen; i++) {
            arr[i - 1] = i;
        }
        // Cetak isi array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
