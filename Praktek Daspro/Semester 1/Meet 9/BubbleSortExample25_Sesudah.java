public class BubbleSortExample25_Sesudah {
    public static void main(String[] args) {
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp;

        for (int i = 0; i < intData.length - 1; i++) {
            for (int j = 0; j < intData.length - i - 1; j++) {
                if (intData[j] < intData[j + 1]) { // Mengubah tanda > menjadi <
                    temp = intData[j];
                    intData[j] = intData[j + 1];
                    intData[j + 1] = temp;
                }
            }
        }

        System.out.println("Hasil pengurutan descending: ");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
