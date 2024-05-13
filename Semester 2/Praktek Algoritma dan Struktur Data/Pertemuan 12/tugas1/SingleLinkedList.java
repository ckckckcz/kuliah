package tugas1;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Linked List kosong");
        } else {
            Node tmp = head;
            System.out.print("Isi Linked List: \t");
            while(tmp != null){
                System.out.print(tmp.data + "  ");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAt(int index, int input){
        if (index < 0) {
            System.out.println("Index cannot be negative!");
            return;
        }
        if (index == 0){
            addFirst(input);
        } else {
            Node newNode = new Node(input, null);
            Node tmp = head;
            for(int i = 0; i < index - 1 && tmp != null; i++){
                tmp = tmp.next;
            }
            if (tmp == null) {
                System.out.println("Index out of bounds!");
                return;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }
}
