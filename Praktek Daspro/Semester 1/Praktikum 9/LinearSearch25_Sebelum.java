public class LinearSearch25_Sebelum {
    public static void main(String[] args) {
        int[] arrayInt = { 34, 18, 26, 48, 72, 20, 56, 63};
        int key =  20;
        int hasil = 0;
        for (int i=0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada didalam array pada posisi indeks ke-" + hasil);
    }
}