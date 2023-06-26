package functions;

import java.util.Arrays;

public class PassByCopyOfReferenceVariable {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr)); // it will change the original object coz both
        // reference variable pointing to same object
    }

    static void change(int[] nums) {
    nums[0]=99;
    }
}
