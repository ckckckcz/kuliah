public class Fungsi24 {
    static int stok[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    public static void main(String[] args) {
        System.out.println("Pendapatan setiap cabang");
        System.out.println("========================");
        pendapatan();
        System.out.println("========================");
        stokRG4();
    }

    public static void pendapatan() {
        int harga[] = { 75000, 50000, 60000, 10000 };
        int total[] = new int[4];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[0].length; j++) {
                total[j] = (stok[i][0] * harga[0]) + (stok[i][1] * harga[1]) + (stok[i][2] * harga[2]) + (stok[i][3]
                        * harga[3]);
            }
            System.out.println("Pendapatan Royal Garden " + (i + 1) + " : " + total[i]);
        }
    }

    public static void stokRG4() {
        System.out.println("Sisa Stok Royal Garden 4");
        System.out.println("========================");
        System.out.println("Algonema\t:" + (stok[3][0] - 1));
        System.out.println("Keladi\t\t:" + (stok[3][1] - 2));
        System.out.println("Alocasia\t:" + (stok[3][2] - 0));
        System.out.println("Mawar\t\t:" + (stok[3][3] - 5));
    }

}