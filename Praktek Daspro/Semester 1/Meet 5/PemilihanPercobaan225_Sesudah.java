import java.util.Scanner;
public class PemilihanPercobaan225 {
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
        String message = total < 65 ? "Remidi" : "Tidak Remdi";
        String nilaiHuruf;
        if (total >= 80){
            nilaiHuruf = "A";
        }else if(total >= 73){
            nilaiHuruf = "B+";
        }else if(total >= 65){
            nilaiHuruf = "B";
        }else if(total >= 60){
            nilaiHuruf = "C+";
        }else if(total >= 50){
            nilaiHuruf = "C";
        }else if(total >= 39){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        System.out.println(" Nilai akhir = " + total + " sehingga anda " + message + " dan mendapatkan " + nilaiHuruf);
    }
    
}
