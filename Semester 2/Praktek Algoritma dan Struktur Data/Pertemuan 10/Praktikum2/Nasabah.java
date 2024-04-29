package Praktikum2;

public class Nasabah {
    String norek, nama, alamat;
    int umur;
    double saldo;
    Nasabah [] data;
    int front, rear, size, max;

    Nasabah(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    public Nasabah(int n){
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public void Enqueue (Nasabah dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1){
                    rear = 0;   
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah Dequeue(){
        Nasabah dt = new Nasabah();
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1 ){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    Nasabah(){

    }

    public void peek(){
        if (isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen terbelakang : " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        }
    }
    

    public void print () {
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public boolean isEmpty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    
}
