package access;
import java.lang.*;



public class A {
    public static void main(String[] args) {
        A obj =  new A();
//        obj.setNum(50);
        System.out.println(obj.num);
    }
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

//    public A(int num, String name) {
//        this.num = num;
//        this.name = name;
//        this.arr = new int[10];
//    }
}
