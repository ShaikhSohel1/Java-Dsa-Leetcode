package Basic;

import java.util.Scanner;

public class IsEvenOdd {
    public static void main(String[] args) {
//      int arr[] =  {1,2,3,1,2};
//      int[] result = new int[arr.length];
//
//        for (int i = arr.length-1; i>=0 ; i--) {
//            result[i]=arr[i]*arr[i];
//    }
//        int left =1;
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = result[i]*left;
//            left= left*arr[i];
//            System.out.println(result[i]+" ");
//
//        }

        String string1 ="Good Software like wine needs time";
        int count;
        char string[]= string1.toCharArray();
        for (int i = 0; i < string.length; i++) {
            count =1;
            for (int j = i+1; j < string.length; j++) {
                if(string[i]==string[j] && string[i]!=' '){
                    count++;
                    string[j]='O';
                }
            }
            if(count>1 && string[i]!='O')
                System.out.println(string[i]);
        }

}
}
