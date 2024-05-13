package tugas2;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList queue = new SingleLinkedList(5); // Maksimum 5 elemen dalam antrian

        System.out.println("Antrian saat ini:");
        queue.print();

        // Menambahkan beberapa elemen ke dalam antrian
        queue.Enqueue(111);
        queue.Enqueue(112);
        queue.Enqueue(113);

        System.out.println("\nAntrian setelah penambahan elemen:");
        queue.print();

        // Melihat elemen terdepan
        queue.peek();

        // Menghapus beberapa elemen dari antrian
        System.out.println("\nMenghapus beberapa elemen dari antrian:");
        queue.Dequeue();
        queue.Dequeue();

        System.out.println("\nAntrian setelah penghapusan elemen:");
        queue.print();

        // Menambahkan beberapa elemen baru ke dalam antrian
        queue.Enqueue(114);
        queue.Enqueue(115);

        System.out.println("\nAntrian setelah penambahan elemen baru:");
        queue.print();

        // Mengosongkan antrian
        System.out.println("\nMengosongkan antrian:");
        queue.clear();

        System.out.println("\nAntrian setelah dikosongkan:");
        queue.print();
    }
}
