import java.util.Scanner;
public class ifKondisi {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Masukkan Suhu : ");
        int suhu = input.nextInt();
        if(suhu<16){
            System.out.println("Silahkan memakai jaket");
        }else if(suhu<20){
            System.out.println("Silahkan pakai baju tebal");
        }else{
            System.out.println("Silahkan pakai topi");
        }
    }
}
