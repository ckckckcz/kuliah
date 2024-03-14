package Pertemuan4.Minggu5;

public class MainMobil {
    public static void main(String[] args) {
        Mobil[] mobil = {
            new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
            new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
            new Mobil("Nissan", "370Z", 2009, 4360, 657),
            new Mobil("Subaru", "BRZ", 2014, 4058, 609),
            new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
            new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Mobil showroom = new Mobil("Merk", "Tipe", 2022, 0, 0);

        int tertinggi = showroom.tertinggiDC(mobil, 0, mobil.length - 1);
        int terendah = showroom.terendahDC(mobil, 0, mobil.length - 1);
        double rataRata = showroom.rataRataBF(mobil);

        System.out.println("Top acceleration tertinggi: " + tertinggi);
        System.out.println("Top acceleration terendah: " + terendah);
        System.out.println("Rata-rata acceleration: " + rataRata);
    }
}