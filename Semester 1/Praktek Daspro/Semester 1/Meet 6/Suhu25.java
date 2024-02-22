import java.util.Scanner;
public class Suhu25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suhu;
        char hujan;
        System.out.print("Masukkkan suhu :  ");
        suhu = sc.nextInt();
        System.out.print("Masukkan Status Hujan : (y  atau t)");
        hujan = sc.next().charAt(0);
        if (suhu >= 27){
            System.out.println("Memakai Dress");
            if (hujan == 'y' || hujan == 'Y'){
                System.out.println("Membawa Payung");
            }else {
                System.out.println("Memakai Suncsreen");
            }
        }else {
            System.out.println("Memakai Celana Panjang");
        }
    }
}
