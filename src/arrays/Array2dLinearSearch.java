package arrays;

public class Array2dLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,8,0,4},
                {12,10}
        };

        int target= 12;
        System.out.println(sreach2d(arr,target));
    }

    static boolean sreach2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target) {
                    return true;
                }

            }
        }
        return false;
    }
}
