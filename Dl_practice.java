class DL {
    Node head;
    Node tail;

    public static class Node {
        int data;
        Node next;
        Node pre;

        Node(int data) {
            this.data = data;
            pre = null;
            next = null;

        }
    }

    void Displayrev() {
        Node p = tail;
        while (p != null) {
            System.out.println(p.data);
            p = p.pre;

        }
    }

    void Insert(int x) {
        Node n = new Node(x);
        n.next = head;
        n.pre = null;
        if (head != null) {
            head.pre = n;
        }
        head = n;

    }

    void Inseratend(int x) {
        Node p = head;
        Node n = new Node(x);
        while (p.next != null) {
            // System.out.println(p.data);
            p = p.next;

        }
        p.next = n;
        n.pre = n;
        tail = n;

    }

    void InsertAtIndex(int idx, int data) {
        Node t = new Node(data);
        // temp =head;
        // temp.next.pre=n;
        // n.prev=temp;
        // n.next=temp.next;
        // temp.next=n;

        // Node r= s.next;
        // Node t = new Node(data);
        // s.next=t;
        // t.prev =s ;
        // t.next=r;
        // r.pre =t;
        Node s = head;
        for (int i = 0; i < idx - 1; i++) {
            s = s.next;
        }
        Node r = s.next;
        s.next = t;
        t.pre = s;
        t.next = r;
        if (r != null) {
            r.pre = t;
        }
    }

    void Display() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;

        }
    }

    public static void main(String[] args) {
        DL n = new DL();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.pre = null;
        a.next = b;
        b.pre = a;
        b.next = c;
        c.pre = b;
        c.next = d;
        d.pre = c;
        d.next = e;
        e.pre = d;

        // n.head = a;
        // n.tail = e;
        // Node n = 3;
        n.head = a;
        // n.Insert(60);
        // n.Display();
        n.InsertAtIndex(4, 15);
        // n.Inseratend(20);
        n.Display();
        // n.Displayrev();
    }
}

