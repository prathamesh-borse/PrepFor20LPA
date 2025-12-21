package LinkedList.CRUDOperations.revision202522Nov;

public class LLMain {
    public static void main(String[] args) {
        TestSLL list = new TestSLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();

        list.insertAtMiddle(100, 2);
        list.display();

        list.insertLast(200);
        list.display();

        int deleteFirst = list.deleteFirst();
        System.out.println(deleteFirst);
        list.display();

        int deleteLast = list.deleteLast();
        System.out.println(deleteLast);
        list.display();

        int deleteFromMiddle = list.delete(1);
        System.out.println(deleteFromMiddle);
        list.display();
    }
}
