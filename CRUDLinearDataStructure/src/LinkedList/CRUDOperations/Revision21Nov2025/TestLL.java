package LinkedList.CRUDOperations.Revision21Nov2025;

public class TestLL {

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

    public void insertAtMiddle(int val, int index) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        // here we are traversing temp head to reach at the particular location
        // starting it from 0 it will not be reaching at correct location, so start from 1 itself
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
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
        int value = head.val;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
        return value;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
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

    public TestLL() {
        this.size = 0;
    }

    private class Node {
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
