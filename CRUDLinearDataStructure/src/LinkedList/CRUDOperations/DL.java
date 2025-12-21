package LinkedList.CRUDOperations;

public class DL {
    private Node head;
    private int size;

    public DL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("Node does exist");
        }

        Node node = new Node(val);
        node.next = p.next; // pointing new node to the next node and prev node
        p.next = node; // pointing previous node next to the new code
        node.prev = p; // pointing new node previous to index previous node
        if (node.next != null) { // checking because new node should not point to null
            node.next.prev = node; // pointing new nodes next pointer to the previous node pointer to himself
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node node = head;
        Node last = null; // Maintaining last Node
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node; // Updating the last Node
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print In Reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
