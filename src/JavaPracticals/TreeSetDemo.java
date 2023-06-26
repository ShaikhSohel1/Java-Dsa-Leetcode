package JavaPracticals;


import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> list = new TreeSet<>();
        System.out.println("Enetr How Many Colors U Want To Put In");
        int noOfColors = in.nextInt();
        in.nextLine();
        for (int i = 0; i <noOfColors ; i++) {
            list.add(in.nextLine());
        }
        System.out.println(list);
    }
}
