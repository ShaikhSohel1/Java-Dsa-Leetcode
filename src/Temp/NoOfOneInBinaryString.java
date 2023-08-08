package Temp;
import java.util.*;
public class NoOfOneInBinaryString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int integer = sc.nextInt();
        String binary = Integer.toBinaryString(integer);
        System.out.println(binary);
        int count=0;
//        for(int i=0; i<binary.length(); i++){
//            if(binary.charAt(i)=='1'){
//                count++;
//            }
//        }

        while (integer > 0) {
            if ((integer & 1) == 1) {
                count++;
            }
            integer >>= 1;
        }


        System.out.println(count);

    }
}
