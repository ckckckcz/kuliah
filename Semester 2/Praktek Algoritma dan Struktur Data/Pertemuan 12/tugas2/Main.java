package tugas2;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList queue = new SingleLinkedList();
        queue.enqueue(111);
        queue.print();
        queue.enqueue(112);
        queue.print();
        queue.enqueue(113);
        queue.print();
        queue.enqueue(114);
        queue.print();
        queue.enqueue(115);
        queue.print();
        System.out.println();

        System.out.println("Elemen paling depan antrian: " + queue.peek());
        queue.dequeue();

        System.out.println();
        System.out.println("Antrian setelah dequeue");
        queue.print();
        System.out.println();
    }    
}