package Stack;
public class Gudang24 {
    Barang24[] tumpukan;
    int size;
    int top;

    public Gudang24(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang24[size];
        top = -1;
    }

    // public boolean cekKosong(){
    //     if (top == -1){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public boolean cekPenuh(){
    //     if (top == -1){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    public boolean cekKosong(){
        return top < 0;
    }

    public boolean cekPenuh(){
        return top == size - 1;
    }

    public void tambahBarang(Barang24 brg){
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal ! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang24 ambilBarang(){
        if (!cekKosong()){
            Barang24 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang24 lihatBarangTeratas(){
        if (!cekKosong()){
            Barang24 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama );
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()){
            System.out.println("Berikut rincian tumpukan barang di Gudang : ");
            for (int i = 0; i <= top; i++){
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    // Sesi 2

    public String konversiDesimalKeBiner(int kode){
        StackKonversi24 stack = new StackKonversi24();
        while(kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        } 
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }

    // Latihan Praktikum 
    public void lihatBarangBawah(){
        if(!cekKosong()){
            System.out.println("Barang Terbawah : " + tumpukan[0].nama);
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public void mencariBarang(String keyword){
        boolean ditemukan = false;
        if (!cekKosong()){
            for (int i = 0; i <= top; i++){
                if(tumpukan[i].nama.equalsIgnoreCase(keyword) || tumpukan[i].kode == Integer.parseInt(keyword)){
                    System.out.println("Barang yang anda cari ditemukan");
                    System.out.printf("Kode : %d, Nama : %s, Kategori : %s\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                    ditemukan = true;
                    break;
                }
            }
        }
        if(!ditemukan){
            System.out.println("Barang yang anda cari tidak ditemukan");
        }
    }
}
