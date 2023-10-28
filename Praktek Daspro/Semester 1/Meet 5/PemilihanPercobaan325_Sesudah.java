import java.util.Scanner;
public class PemilihanPercobaan325_Sesudah {
    public static void main(String[] args) {
        Scanner input25 = new Scanner (System.in);
        double angka1, angka2, hasil;
        char operator;
        System.out.println("Masukkan angka pertama : ");
        angka1 = input25.nextDouble();
        System.out.println("Masukkan angka kedua : ");;
        angka2 = input25.nextDouble();
        System.out.println("Masukkan operator (+ - * /)");
        operator = input25.next().charAt(0);
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                // break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
            default:
                System.out.println("Operator Tidak Valid");
        }
    }
    
}
