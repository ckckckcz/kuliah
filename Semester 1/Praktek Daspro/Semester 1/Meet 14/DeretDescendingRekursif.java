public class DeretDescendingRekursif {

    // Fungsi rekursif
    static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }

    // Fungsi iteratif
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Misalnya, menampilkan deret dari 10 sampai 0

        System.out.println("Deret descending dengan fungsi rekursif:");
        deretRekursif(n);

        System.out.println("\nDeret descending dengan fungsi iteratif:");
        deretIteratif(n);
    }
}
