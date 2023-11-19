import java.util.Arrays;
public class sorting25 {
    public static void main(String[] args) {

        // Membuat array untuk menyimpan data atlet berdasarkan cabang olahraga
        String[][] dataAtlet = {
                {"Badminton", "Rio", "pet", "tyang", "rahman", "Adam"},
                {"Tenis paras", "Fenly", "Zayyan", "Saka", "Sarah", "Hendra"},
                {"Basket", "dimas", "Azza", "Kara", "Farah", "Zahra"},
                {"Bola Voly", "danang", "Zacky", "galuh", "Ifa", "Sifa"}
        };

        // Fungsi ini sebagai menampilkan informasi nama atlet dari berbagai cabang secara ascending
        for (String[] cabangAtlet : dataAtlet) {
            String cabang = cabangAtlet[0];
            String[] atlet = Arrays.copyOfRange(cabangAtlet, 1, cabangAtlet.length);

            // Fungs untuk mengurutkan nama atlet secara ascending
            int n = atlet.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (atlet[j].compareTo(atlet[j + 1]) > 0) {
                        String temp = atlet[j];
                        atlet[j] = atlet[j + 1];
                        atlet[j + 1] = temp;
                    }
                }
            }

            System.out.print("Atlet " + cabang + ": ");
            for (int i = 0; i < atlet.length; i++) {
                System.out.print(atlet[i]);
                if (i < atlet.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}