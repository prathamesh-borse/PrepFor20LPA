package LinkedList.CRUDOperations;

public class TestDL {
    public static void main(String[] args) {
        DL doublyLinkedList = new DL();
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(30);
        doublyLinkedList.insertFirst(40);
        doublyLinkedList.insertFirst(50);
        doublyLinkedList.display();
        System.out.println("Inserting Element at Middle or Index Position: ");
        doublyLinkedList.insert(30, 200);
        doublyLinkedList.display();
        System.out.println("Inserting Element at last: ");
        doublyLinkedList.insertLast(100);
        doublyLinkedList.display();
    }
}
