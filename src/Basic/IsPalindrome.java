package Basic;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class IsPalindrome {
    public static void main(String[] args) {
        String string;
                String stringRev="";
        Scanner input = new Scanner(System.in);
        string= input.next();

        for (int i = string.length()-1; i >=0 ; i--) {
            stringRev=stringRev + string.charAt(i);
        }

        if(string.equalsIgnoreCase(stringRev)) {
            System.out.println(string+" Is Palindrome");
        }
        else {
            System.out.println(string+" Is not palindrome");
        }

    }
}
