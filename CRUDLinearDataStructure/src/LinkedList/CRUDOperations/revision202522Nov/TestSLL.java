package LinkedList.CRUDOperations.revision202522Nov;

public class TestSLL {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertAtMiddle(int val, int index) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node idxNode = get(index);
        Node node = new Node(val, idxNode.next);
        idxNode.next = node;
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public TestSLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}