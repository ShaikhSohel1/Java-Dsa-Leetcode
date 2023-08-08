package stacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        System.out.println(queue.front());
        System.out.println(queue.remove());
        queue.insert(35);
        System.out.println(queue.front());
        queue.display();



    }
}
