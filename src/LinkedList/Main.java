package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(30);
        list.insertAtFirst(20);
        list.insertAtFirst(10);
        list.insertAtEnd(40);
        list.insertAtPosition(2,60);
        list.displayList();
        System.out.println(list.deleteAtFirst());
        list.displayList();
        System.out.println(list.deleteAtLast());
        list.displayList();
        list.insertAtEnd(20);
        list.displayList();
        list.deleteAtPostion(2);
        list.displayList();

        System.out.println(list.findByValue(20));

    }
}
