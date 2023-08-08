package opps;

import java.util.Arrays;
import java.util.Scanner;

public class  BasicIntroduction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declaring
        //Student student;
        // memory At RunTime
        //student = new Student();

        Student students = new Student("soh",1,99.9f);
        Student s2 = new Student();
        System.out.println(s2.ans);
//        students.name = "Sohel";
//        students.rollNo = 1;
//        students.marks = 99;
        System.out.println(students);
        System.out.println(students.name);
        System.out.println(students.rollNo);
        System.out.println(students.marks);

    }
}

// data type of students with 3 properties
// for every single student
class Student {
    int rollNo;
    String name;
    float marks;
    boolean ans;

    Student (){
        // this is how you call a constructor from another constructor
        this (1,true);
    }

    Student (String name, int rollNo, float marks) {
//        Scanner input = new Scanner(System.in);
        this.name = name; //input.nextLine();
        this.rollNo = rollNo; //input.nextInt();
        this.marks = marks; //input.nextFloat();
    }

    Student (int rollNo,boolean ans){
        this.rollNo = rollNo;
        this.ans = ans;
    }
}
