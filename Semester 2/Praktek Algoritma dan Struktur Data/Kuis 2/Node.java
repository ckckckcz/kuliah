public class Node {
    Team team;
    Node next;
    Node prev;

    public Node(Team team) {
        this.team = team;
        this.next = null;
        this.prev = null;
    }
}