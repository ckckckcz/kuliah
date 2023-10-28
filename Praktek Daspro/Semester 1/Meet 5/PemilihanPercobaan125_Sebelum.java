import java.util.Scanner;
public class PemilihanPercobaan125_Sebelum {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int angka = input25.nextInt();
        if (angka % 2 == 0){
            System.out.println("Angka " + angka + "bilangan genap");
        }else{
            System.out.println("Angka " + angka + "bilangan ganjil");
        }
    }
    
}
