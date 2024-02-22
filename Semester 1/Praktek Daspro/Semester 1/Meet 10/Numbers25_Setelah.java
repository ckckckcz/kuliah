import java.util.Arrays;

public class Numbers25_Setelah{
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][5]; // Setiap baris memiliki panjang 5
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}