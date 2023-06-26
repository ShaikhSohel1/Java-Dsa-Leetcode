package Basic;

import java.util.Scanner;

public class FibonacciUpToN {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int nextTerm= num1+num2;
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Fibonacci Series : "+ num1+","+num2+",");
        for (int i=3;i<=n;i++) {
            System.out.print(nextTerm+",");
            num1=num2;
            num2 = nextTerm;
            nextTerm= num1 + num2;
        }
    }
}
