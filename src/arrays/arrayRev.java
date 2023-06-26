package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRev {

    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println(arr.length);

        System.out.println("Enter 5 Entries: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] revArr) {
        int iLast= revArr.length-1;
        int iStart=0;
        int temp;
        while (iStart<iLast) {
            temp=revArr[iStart];
            revArr[iStart++]= revArr[iLast];
            revArr[iLast--]= temp;
        }
    }
}
