package LinkedList.CRUDOperations;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        System.out.println("Before inserting Last Element: ");
        list.displayLL();
        list.insertAtEnd(99);
        System.out.println("After inserting element at Last Element: ");
        list.displayLL();
        list.insertAtMiddle(100, 3);
        System.out.println("After inserting element at specific index: ");
        list.displayLL();
        int deleteFirst = list.deleteFirst();
        System.out.println("After deleting first element : ");
        System.out.println(deleteFirst);
        list.displayLL();
        int deleteLast = list.deleteLast();
        System.out.println("After deleting last element : ");
        System.out.println(deleteLast);
        list.displayLL();
        int deleteElementFromIndex = list.delete(2); // 100 this element will be deleted
        System.out.println("After deleting element from index: ");
        System.out.println(deleteElementFromIndex);
        list.displayLL();
    }
}
