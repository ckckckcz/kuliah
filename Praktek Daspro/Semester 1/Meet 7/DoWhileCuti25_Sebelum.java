import java.util.Scanner;
public class DoWhileCuti25_Sebelum {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah Cuti : ");
        jatahCuti =  input25.nextInt();
        do {
            System.out.print("Apakah anda ingin mengambil  cuti (y/t) ?");
            konfirmasi = input25.next();

            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari :");
                jumlahHari = input25.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa Jatah Cuti : " + jatahCuti);
                }else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);
    }
}