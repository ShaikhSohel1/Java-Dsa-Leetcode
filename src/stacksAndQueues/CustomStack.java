package stacksAndQueues;

import javax.naming.SizeLimitExceededException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =10 ;

    int ptr =-1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.data = new int[DEFAULT_SIZE];
    }



    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full!!!");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw  new Exception("Cannot Peek, Stack Is Empty!!1");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw  new Exception("Cannot Peek, Stack Is Empty!!1");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }



}
