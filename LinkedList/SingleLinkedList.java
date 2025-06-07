package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class InnerSingleLinkedList {
    Node head;

    InnerSingleLinkedList() {
        this.head = null;
    }

    void addback(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node dummy = head;
            while (dummy.next != null) {
                dummy = dummy.next;
            }
            dummy.next = new Node(data);
        }
    }

    void addfront(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node dummy = head;
            head = new Node(data);
            head.next = dummy;
        }
    }

    void printlist() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    void removefront() {
        if (head == null) {
            System.out.println("list is empty nothing to remove");
        } else {
            head = head.next;
        }
    }

    void removeback() {
        if (head == null) {
            System.out.println("list is empty nothing to remove");
        } else if (head.next == null) {
            head = null;
        } else {
            Node dummy = head;
            while (dummy.next.next != null) {
                dummy = dummy.next;
            }
            dummy.next = null;
        }
    }

    void removeposition(int n) {
        if (head == null || n == 0) {
            System.out.println("list is empty nothing to remove");
        } else if (n == 1) {
            this.removefront();
        } else {
            int count = 1;
            Node current = head;
            while (count != n - 1) {
                current = current.next;
                count += 1;
            }
            current.next = current.next.next;
        }
    }

}

public class SingleLinkedList {
    public static void main(String[] args) {
        InnerSingleLinkedList obj1 = new InnerSingleLinkedList();
        obj1.addback(10);
        obj1.addback(11);
        obj1.addfront(9);
        obj1.printlist();
        obj1.removeback();
        obj1.removefront();
        System.out.print("after removing: ");
        obj1.printlist();
    }
}
