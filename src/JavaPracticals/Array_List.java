package JavaPracticals;


import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enetr How Many Cities U Want: ");
        int n = in.nextInt();
        System.out.println("Enetr The Cities: ");
        in.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(i,in.nextLine());
        }
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}

