package tugas;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.print();
        linkedList.addFirst(111);
        linkedList.print();
        linkedList.addLast(112);
        linkedList.print();
        linkedList.addLast(113);
        linkedList.print();
        linkedList.insertAt(3, 114);
        linkedList.print();
        linkedList.insertAt(4, 115);
        linkedList.print();
    }
}
    