package LinkedList.CRUDOperations;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;

        if (node == null) {
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        // here in the below loop we are finding the element which is equal to head or not
        // if not then move the n pointer -> and check if the n element is equal to the value and exit
        // this process will happen till the time node is not reaches head
        do {
            Node n = node.next;
            // here, we are checking the next element of the current head it is equal or not
            // till the time node is not reached to head
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }


    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
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
