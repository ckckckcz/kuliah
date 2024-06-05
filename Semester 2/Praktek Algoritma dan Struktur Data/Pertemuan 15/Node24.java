public class Node24 {
    int data;
    Node24 prev, next;
    int jarak;

    Node24(Node24 prev, int data, int jarak, Node24 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}