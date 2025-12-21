package LinkedList.CRUDOperations.Revision21Nov2025;

public class Main {
    public static void main(String[] args) {
        TestLL list = new TestLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();

        System.out.println("INSERTING ELEMENT AT LAST");
        list.insertLast(100);
        list.display();

        System.out.println("INSERTING ELEMENT AT SPECIFIC INDEX");
        list.insertAtMiddle(200, 3);
        list.display();

        System.out.println("DELETE ELEMENT FROM FRONT");
        int deleteFirst = list.deleteFirst();
        System.out.println(deleteFirst);
        list.display();

        System.out.println("DELETE ELEMENT FROM END");
        int deleteLast = list.deleteLast();
        System.out.println(deleteLast);
        list.display();

        System.out.println("DELETE ELEMENT FROM SPECIFIC INDEX");
        int deleteFromIndex = list.delete(2);
        System.out.println(deleteFromIndex);
        list.display();
    }
}
