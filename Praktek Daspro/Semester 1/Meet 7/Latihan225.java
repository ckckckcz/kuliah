public class Latihan225 {
    public static void main(String[] args) {
        int i = 25;
        int sum = 0;
        do {
            sum += i;
            i--;
        } while (i >= 0);
        System.out.println("Hasil penjumlahan deret bilangan: " + sum);
    }
}