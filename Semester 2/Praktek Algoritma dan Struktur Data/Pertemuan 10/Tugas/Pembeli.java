package Tugas;

public class Pembeli {
    private String nama;
    private int noHP;
    public Pembeli(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
    public String getNama() {
        return nama;
    }
    public int getNoHP() {
        return noHP;
    }
    @Override
    public String toString() {
        return "Pembeli [nama=" + nama + ", noHP=" + noHP + "]";
    }
}