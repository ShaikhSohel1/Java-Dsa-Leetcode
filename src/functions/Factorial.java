package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Factorial of "+ n +" is "+ factorial(n));
        palindrome(n);
    }

    static long factorial(int n) {

        return  (n==1 || n==0)? 1: n* factorial(n-1);
    }

    static void palindrome(int num) {
        int reversed=0,original=num,remainder;
        while (num !=0) {
            remainder = num % 10;
            reversed= reversed *10 + remainder;
            num/=10;
        }
        if (reversed == original) {
            System.out.println(original+" Is palindrome number");
        }
        else {
            System.out.println(original+" Is not palindrome number");
        }
    }
}
