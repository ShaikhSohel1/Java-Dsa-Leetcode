package LinkedList;

public class DoubleLL {

    private Node head;

    private Node tail;

    private int size;

        public DoubleLL(){
            this.size = 0;
        }

        public void insertAtFirst(int value){
            Node node = new Node(value);
            node.next = head;
            node.prev = null;
            if(head != null){
                head.prev = node;
            }

            head = node;

        }

        public void displayDLL(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("End");
        }

    public void displayDLLReverse(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        System.out.println("Print In Reverse");{
            while (last != null){
                System.out.print(last.data + "->");
                last = last.prev;
            }
            System.out.print("START");
        }
    }

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data){
            this.data = data;
        }
    }

}
