package Temp;
import java.lang.reflect.Array;
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        boolean flag = false;
        for (int i =0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                flag = true;
                break;
            }
        }


        System.out.println(flag);
    }
}
