package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
//        int[] arr= new int[5];
        Scanner in = new Scanner(System.in);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }

            // prinying ways
//            System.out.print(Arrays.toString(arr));

//        for (int nums:
//             arr) {
//            System.out.print(nums+ " ");
//        }
//
        int[][] arr= new int[3][3];
        //Input in 2D arrays
        for (int row = 0; row <arr.length ; row++) {
            // for every row each col
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();

            }
        }
        // Output in 2D arrays
//        for (int row = 0; row <arr.length ; row++) {
//            // for every row each col
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col]+ " ");
//
//            }
//            System.out.println("");
//        }

//         ways of printing 2d arrray
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        ways of printing 2d arrray
        for (int[] nums:arr) {
            System.out.println(Arrays.toString(nums));
        }



    }
}
