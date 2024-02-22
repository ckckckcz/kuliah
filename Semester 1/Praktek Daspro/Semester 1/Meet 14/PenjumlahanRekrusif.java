public class PenjumlahanRekrusif {

    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8; // Misalnya, menghitung penjumlahan bilangan dari 1 hingga 8
        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " = " + hasil);
    }
}
