package tugas2;

public class SingleLinkedList {
    Node front, rear;
    int size, max;

    public SingleLinkedList(int n){
        max = n;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek(){
        if (!isEmpty()){
            System.out.println("Elemen terdepan : " + front.data);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print () {
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            Node current = front;
            System.out.print("Isi Queue: ");
            while (current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("\nJumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!isEmpty()){
            front = rear = null;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1); // Stop the program on queue overflow
        } else {
            Node newNode = new Node(dt);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0); // Stop the program on queue underflow
        } else {
            dt = front.data;
            front = front.next;
            size--;
            if (isEmpty()) {
                rear = null;
            }
        }
        return dt;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
