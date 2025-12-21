package LinkedList.CRUDOperations.revision202522Nov;

public class DLLMain {
    public static void main(String[] args) {
        TestDLL list = new TestDLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();

        list.insert(40, 200);
        list.display();

        list.insertLast(100);
        list.display();
    }
}
