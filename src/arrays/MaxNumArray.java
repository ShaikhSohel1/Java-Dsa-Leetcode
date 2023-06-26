package arrays;

import java.util.Scanner;

public class MaxNumArray {
    static int ans=0;
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        maxOfArray(arr);
        System.out.println(ans);
    }

    static void maxOfArray(int[] arr) {
        int  index = 0;

        while (index < 4) {
            if (arr[index] < arr[++index]) {
                ans = arr[index];
            }
        }
    }

}