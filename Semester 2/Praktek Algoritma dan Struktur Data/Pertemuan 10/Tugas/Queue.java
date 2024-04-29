package Tugas;

public class Queue {
    private Pembeli[] antrian;
    private int front;
    private int rear;
    private int size;
    private int max;

    public Queue(int max) {
        this.antrian = new Pembeli[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.max = max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pembeli pembeli) {
        if (!isFull()) {
            rear++;
            if (rear == max) {
                rear = 0;
            }
            antrian[rear] = pembeli;
            size++;
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public Pembeli dequeue() {
        if (!isEmpty()) {
            Pembeli pembeli = antrian[front];
            front++;
            if (front == max) {
                front = 0;
            }
            size--;
            return pembeli;
        } else {
            System.out.println("Antrian kosong!");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian pembeli:");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.println((j + 1) + ". " + antrian[i]);
                i++;
                if (i == max) {
                    i = 0;
                }
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("---------------------------------------------");
            System.out.println("Pembeli paling depan, ");
            System.out.println("Nama : " + antrian[front].getNama());
            System.out.println("Nomor Hp : " + antrian[front].getNoHP());
            System.out.println("---------------------------------------------");
            System.out.println("");
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = rear;
            if (i < 0) {
                i = max - 1;
            }
            System.out.println("---------------------------------------------");
            System.out.println("Pembeli paling belakang, ");
            System.out.println("Nama : " + antrian[i].getNama());
            System.out.println("Nomor Hp : " + antrian[i].getNoHP());
            System.out.println("---------------------------------------------");
            System.out.println("");
        }
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = front;
            for (int j = 0; j < size; j++) {
                if (antrian[i].getNama().equals(nama)) {
                    System.out.println("Pembeli " + nama + " berada di posisi ke-" + (j + 1));
                    System.out.println("---------------------------------------------");
                    return;
                }
                i++;
                if (i == max) {
                    i = 0;
                }
            }
            System.out.println("Pembeli " + nama + " tidak ditemukan di antrian.");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("---------------------------------------------");
            System.out.println("Daftar pembeli:");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.println((j + 1) + ". Nama: " + antrian[i].getNama() + ", No HP: " + antrian[i].getNoHP());
                i++;
                if (i == max) {
                    i = 0;
                }
            }
            System.out.println("---------------------------------------------");
            System.out.println("");
        }
    }
}