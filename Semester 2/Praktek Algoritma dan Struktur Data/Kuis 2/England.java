
public class England {
    Node head;
    Node tail;

    public England() {
        this.head = null;
        this.tail = null;
    }

    public void addTeam(Team team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node existingTeam = findTeam(team.name);
            if (existingTeam != null) {
                System.out.println("Team " + team.name + " sudah ada, silahkan masukkan nama team lain ");
                return;
            }

            Node current = head;
            while (current != null && current.team.points > team.points) {
                current = current.next;
            }
            if (current == head) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else if (current == null) {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else {
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void reorderTeams() {
        Node current = head;
        head = null;
        tail = null;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            current.prev = null;
            addTeam(current.team);
            current = next;
        }
    }

    public Node findTeam(String teamName) {
        Node current = head;
        while (current != null) {
            if (current.team.name.equalsIgnoreCase(teamName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printTable() {
        Node current = head;
        System.out.printf("%-20s %2s %2s %2s %2s %2s %2s %3s\n", "Team", "P", "W", "D", "L", "GF", "GA", "Pts");
        while (current != null) {
            System.out.println(current.team);
            current = current.next;
        }
    }
}
