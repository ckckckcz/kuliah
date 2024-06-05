package tugas2;

public class Node {
    int id;
    String title;
    double rating;
    Node prev;
    Node next;

    public Node(int id, String title, double rating, Node prev, Node next) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }
}