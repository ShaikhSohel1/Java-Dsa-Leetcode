package JavaPracticals;

//import java.util.Scanner;

public class ThreadDemo extends  Thread{
    int num;
    String string;
    ThreadDemo(int num,String string) {
        this.num = num;
        this.string = string;
    }

    public void run() {
        System.out.println("Enter The String");
//        Scanner input = new Scanner(System.in);
//        string = input.nextLine();
        int count = 0;
        for (int i = 0; i < num; i++) {
            count+=1;
            System.out.println(string+":"+count);
        }

    }

    public static void main(String[] args) {
        ThreadDemo object = new ThreadDemo(10,"Covid-19");
        ThreadDemo object1 = new ThreadDemo(20,"Lockdown2020");
        ThreadDemo object2 = new ThreadDemo(30,"Vaccinated2021");
        object.start();
        object1.start();
        object2.start();
    }

}
