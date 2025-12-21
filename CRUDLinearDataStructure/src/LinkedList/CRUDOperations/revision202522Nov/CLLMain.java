package LinkedList.CRUDOperations.revision202522Nov;

public class CLLMain {
    public static void main(String[] args) {
        TestCLL list = new TestCLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();

        list.delete(30);
        list.display();
    }
}
