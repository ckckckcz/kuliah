import java.util.Scanner;
public class PemilihanPercobaan225_Sebelum {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Nilai uas : ");
        float uas =  input25.nextFloat();
        System.out.println("Nilai uts : ");
        float uts =  input25.nextFloat();
        System.out.println("Nilai kuis : ");
        float kuis =  input25.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas =  input25.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remdii";
        System.out.println("Nilai akhir = " + total + " sehingga anda " + message);
    }
    
}
