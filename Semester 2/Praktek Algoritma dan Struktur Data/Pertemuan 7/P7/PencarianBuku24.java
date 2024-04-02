package P7;

import java.util.Arrays;
import java.util.Comparator;

public class PencarianBuku24 {
    Buku24 listBK[] = new Buku24[5];
    int idx;
    int jumlahHasil = 0;

    void tambah(Buku24 m){
        if (idx < listBK.length){
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) {
            Buku24 m = listBK[i];
            m.tampilDataBuku24();
        }
    }

    // void tampil(){
    //     for (Buku24 m : listBK[i]){
    //         m.tampilDataBuku24();
    //     }
    // }

    // public int FindSeqSearch(int cari) {
    //     int posisi = -1;
    //     for (int j=0; j<listBK.length; j++) {
    //         if (Integer.parseInt(listBK[j].kodeBuku)==cari){
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // };

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j=0; j<listBK.length; j++) {
            if (listBK[j].judulBuku.equalsIgnoreCase(cari)){
                posisi = j;
                jumlahHasil++;
                break;
            }
        }
        return posisi;
    };

    public int FindJudulSequential(String cari) {
        int posisi = -1;
        jumlahHasil = 0; // Set ulang jumlah hasil
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                jumlahHasil++; // Tambahkan jumlah hasil jika ditemukan
            }
        }
        return posisi;
    };

    public void TampilPosisi(int x, int pos){
        if (pos!=-1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " data tidak dapat ditemukan");
        }
    }
    public void TampilPosisi(int pos){
        if (pos!=-1){
            System.out.println("Data : ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data data tidak dapat ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos!=-1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBK[pos].pengarang);
            System.out.println("Stock\t : " + listBK[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public void TampilData(int pos){
        if (pos!=-1){
            System.out.println("Kode Buku\t : " + listBK[pos].kodeBuku);
            System.out.println("Judul\t : " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBK[pos].pengarang);
            System.out.println("Stock\t : " + listBK[pos].stock);
        } else {
            System.out.println("data tidak ditemukan");
        }
    }

    public Buku24 FindBuku(int cari){
        for (int j = 0; j < idx; j++) {
            if (Integer.parseInt(listBK[j].kodeBuku)==cari){
                return listBK[j];
            }
        }
        return null;
    }

    public int FindJudulBinary(String cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (listBK[mid].judulBuku.equalsIgnoreCase(cari)) {
                return (mid);
            } else if (listBK[mid].judulBuku.length() > cari.length()) {
                return FindJudulBinary(cari, left, mid - 1);
            } else {
                return FindJudulBinary(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int getJumlahHasil(){
        return jumlahHasil;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (listBK[mid].judulBuku.equalsIgnoreCase(cari)) {
                return (mid);
            } else if (listBK[mid].judulBuku.length() > cari.length()) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void sortBubble(){
        for(int i=0; i<listBK.length-1; i++){
            for(int j=1; j<listBK.length-i; j++){
                if(listBK[j].judulBuku.length() < listBK[j-1].judulBuku.length()){
                    Buku24 tmp = listBK[j];
                    listBK[j] = listBK[j-1];
                    listBK[j-1] = tmp;
                }
            }
        }
    }

    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = left + (right - left) / 2;
    //         if (cari == Integer.parseInt(listBK[mid].kodeBuku)) {
    //             return (mid);
    //         } else if (Integer.parseInt(listBK[mid].kodeBuku) > cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // } 

    // public int FindBinarySearch(int cari, int left, int right){
    //     if (right >= left) {
    //         int mid = left + (right - left) / 2;
    //         if (listBK[mid].kodeBuku == cari) {
    //             return mid;
    //         }
    //         if (listBK[mid].kodeBuku > cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         }
    //         return FindBinarySearch(cari, mid + 1, right);
    //     }
    //     return -1;
    // }
}