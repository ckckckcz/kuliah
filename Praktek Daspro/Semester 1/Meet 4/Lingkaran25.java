import java.util.Scanner;
public class Lingkaran25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r;
        double  keliling, luas;
        double phi = 3.14;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r = sc.nextInt();
        keliling = 2*phi*r;
        luas = phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}
