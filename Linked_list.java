import java.util.Scanner;

class Linked_List {
    Node head;

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void Delete() {
        head = head.next;
    }

    void DeleteMagun() {
        Node last = head;
        while (last.next != null && last.next.next != null) {
            last = last.next;
        }
        last.next = null;
    }

    void Insert(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;

    }

    Node reversed(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;

    }

    void append(int new_data) {
        Node new_Node = new Node(new_data);
        if (head == null) {
            Insert(new_data);
            return;
        }
        // new_Node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;

        }
        last.next = new_Node;
        return;
    }

    void insertAfter(Node pre, int new_data) {
        if (pre == null) {
            System.out.println("Empty List");
        }
        Node new_Node = new Node(new_data);

        new_Node.next = pre.next;
        pre.next = new_Node;

    }

    void DeleteMiddle(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }

    void Display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    void DeleteNode(int key) {
        Node temp = head, prev = null;
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        // ll.head = new Node(10);
        // ll.data = new Node(20);
        // ll.Insert(20);
        // ll.Insert(30);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            int dada = sc.nextInt();
            ll.append(dada);
        }
        // ll.insertAfter(ll.head, 15);
        // ll.Delete();
        // ll.DeleteMagun();
        // ll.DeleteMiddle(20);/
        ll.reversed(ll.head.next.next.next.next);
        ll.Display();

    }
}
