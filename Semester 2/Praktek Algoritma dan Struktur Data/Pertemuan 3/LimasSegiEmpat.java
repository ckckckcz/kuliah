package Pertemuan3;
public class LimasSegiEmpat {
    public int panjangSisiAlas, tinggiLimas;

    public double hitungLuasPermukaan() {
        return (panjangSisiAlas * panjangSisiAlas) + (4 * 0.5 * panjangSisiAlas * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3) * (panjangSisiAlas * panjangSisiAlas) * tinggiLimas; 
    }
}
