public class L {
    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    void Insert() {
        Node n = new Node(0);
        n.next = head;
        head = n;

    }

    void Insert(int idx, int data) {
        System.out.println("inser fnc");
        Node n = new Node(0);
        Node temp = head;
        // System.out.println(n.data + "" + n.next);
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;

    }

    void Reversed(Node head) {
        Node n = head;
        if (n == null)
            return;

        Reversed(n.next);
        System.out.println(head.data);
    }

    void deleteAt(int idx) {
        System.out.println("inser fnc");
        // Node n = new Node(0);
        Node temp = head;
        // System.out.println(n.data + "" + n.next);
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public static void main(String[] args) {
        L ll = new L();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        ll.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        // ll.Insert();
        // ll.Insert(4, 150);
        // ll.Reversed(head);
        ll.deleteAt(2);

        Node temp = head;
        while (temp != null) {

            System.out.println(temp.data + "" + temp.next);
            temp = temp.next;
        }

        // System.out.println(head.data);
    }

}

