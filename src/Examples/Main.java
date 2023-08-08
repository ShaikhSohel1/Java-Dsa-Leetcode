package Examples;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        long minSum=0;
        long maxSum= 0;
        for(int i=0; i<n-1; i++){
            minSum+=arr[i];
        }

        for (int i = n-1; i>0;i--) {
            maxSum+=arr[i];
        }

        System.out.println(minSum+ " "+ maxSum);
    }

}
