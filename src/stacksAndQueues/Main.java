package stacksAndQueues;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack  = new CustomStack(5);
//        stack.push(50);
//        stack.push(40);
//        stack.push(30);
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());

        DynamicStack dynamicStack = new DynamicStack(5);

        dynamicStack.push(5);
        dynamicStack.push(10);
        dynamicStack.push(15);
        dynamicStack.push(20);
        dynamicStack.push(25);
        dynamicStack.push(30);
        System.out.println(dynamicStack.peek());






    }
}
