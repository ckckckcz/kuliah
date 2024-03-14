package Pertemuan3;
public class Segitiga{
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t){
        this.alas= a;
        this.tinggi= t;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    public static void main(String[] args){
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
        for (int i = 0; i < sgArray.length; i++){
            System.out.println("sgArray ke-" + i + " Luas : " + sgArray[i].hitungLuas());
            System.out.println("sgArray ke-" + i + " Keliling : " + sgArray[i].hitungKeliling());
        }
    }
}

