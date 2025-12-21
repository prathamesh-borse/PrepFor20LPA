package LinkedList.CRUDOperations.Revision21Nov2025;

public class TestDLLMain {
    public static void main(String[] args) {
        TestDLL list = new TestDLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();

        System.out.println("INSERT AT LAST");
        list.insertLast(100);
        list.display();

        System.out.println("INSERT AT INDEX");
        list.insert(20, 200);
        list.display();
    }
}
