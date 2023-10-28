import java.util.Scanner;
public class WhileGaji25_Sebelum {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        System.out.println("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input25.nextInt();

        int i = 0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input25.next();
            System.out.println("Masukkan jumlah jam lembur :");
            jumlahJamLembur = input25.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
 
        }
        System.out.println("Total Gaji Lembur : " + totalGajiLembur);
    }
}