package LinkedList;

import java.awt.event.ItemEvent;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void  insertAtFirst(int value){
        Node node = new Node(value);

            node.next=head;
            head=node;

            if(tail==null){
                tail=head;
            }

            size++;

    }

    public void insertAtPosition(int index,int value){
        if (index == 0 ) {
            insertAtFirst(value);
            return;
        }
        if(index == size){
            insertAtEnd(value);
            return;
        }
        if (index > size){
            throw  new IndexOutOfBoundsException("Index Out Of Range");
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
                temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;

        size++;

    }

    public void insertAtEnd(int value) {

        if ( tail==null ){
            insertAtFirst(value);
            return;
        }

        Node node =new Node(value);
        tail.next=node;
        tail=node;
        size++;



    }

    public int deleteAtFirst(){
        if(head == null){
            System.out.println("List Is empty");
           return 0;
        }
        int val = head.value;
        Node temp = head;
        head = head.next;
        temp.next=null;

        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteAtPostion(int index){
        if(index ==0){
          return deleteAtFirst();
        }
        if (index == size-1){
            return deleteAtLast();
        }

        Node prevIndex = get(index-1);
        int val = prevIndex.next.value;
        prevIndex.next = prevIndex.next.next;
        size--;

        return val;
    }

    public int deleteAtLast(){
        if(size <= 1){
           return deleteAtFirst();

        }

        Node secondLast = get(size-2);
        int val = tail.value;

        tail = secondLast;
        tail.next=null;
        size--;
        return val;

    }
    public void displayList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public Node findByValue(int val){
        Node temp = head;
        while (temp!=null){
            if(temp.value == val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    private class Node {
       private int value;
       private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
