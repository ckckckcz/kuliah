public class Node {
    int data;
    Node next;

    public Node(int data, Node berikutnya){
        this.data = data;
        this.next = berikutnya;
    }

    public Node(){
        this.data = 0;
        this.next = null;
    }
}

