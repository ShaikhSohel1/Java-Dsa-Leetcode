package JavaPracticals;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Object> ll = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter How Many Friends name U Want to store");
        int n= input.nextInt();

        System.out.println("Enetr "+n+" Names :");
        input.nextLine();
        for (int i = 0; i < n; i++) {
            ll.add(input.nextLine());
        }

        System.out.println("Friends: "+ ll);
        input.close();
    }
}
