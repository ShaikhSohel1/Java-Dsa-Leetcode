package Temp;
import java.util.*;
public class SumOfMinFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr= new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;

        for (int i=0; i<n; i++){
            long sum=0;
            for(int j =0; j<n; j++){
                if(i!=j) {
                    sum+=arr[j];
                }
            }
            minSum = Math.min(minSum,sum);
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(minSum+" "+ maxSum);
    }
}
