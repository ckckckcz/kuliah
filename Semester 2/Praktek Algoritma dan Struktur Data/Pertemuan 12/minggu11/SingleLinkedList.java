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

    // Percobaan 2.2

    int getData(int index){
        Node tmp = head;
        for (int i = 0; i < index && tmp != null; i++){
            tmp = tmp.next;
        }
        if (tmp != null) {
            return tmp.data;
        } else {
            return -1; // or throw an exception for index out of bounds
        }
    }

    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        } 
        if(tmp != null){
            return index;
        } else {
            return -1;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        }
    
        if (head.data == key) {
            removeFirst();
            return;
        }
    
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == key) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Elemen tidak ditemukan dalam linked list.");
    }
    
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        }
    
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        }
    
        if (head == tail) {
            head = tail = null;
            return;
        }
    
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    
    void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        if (index < 0) {
            System.out.println("Index tidak bisa negatif!");
            return;
        }
    
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
    
        if (temp == null || temp.next == null) {
            System.out.println("Indeks di luar batas!");
            return;
        }
    
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
    }
    
}



