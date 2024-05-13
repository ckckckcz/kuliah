package tugas2;

public class Node {
    int data;
    Node next;

    public Node(int data, Node berikutnya){
        this.data = data;
        this.next = berikutnya;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}