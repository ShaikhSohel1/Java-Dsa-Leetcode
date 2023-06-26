package Basic;

import java.util.Scanner;

public class OperatorUsingIf {
    public static void main(String[] args) {
        char operator;
        int num1,num2;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter two numbers");
        num1=input.nextInt();
        num2=input.nextInt();

        System.out.println("Enter the operator(+,-,*,/)");
        operator = input.next().charAt(0);
        if (operator=='+') {
            System.out.println("Sum :"+(num1+num2));
        }
        if  (operator=='-') {
            System.out.println("Sub :"+ (num1-num2));
        }
        if (operator=='*') {
            System.out.println("Mul :"+(num1*num2));
        }
        if (operator=='/') {
            System.out.println("Div :"+(num1/num2));
        }
    }
}
