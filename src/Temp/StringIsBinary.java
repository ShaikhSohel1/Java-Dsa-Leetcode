package Temp;
import java.util.*;
import java.util.stream.Stream;

public class StringIsBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        boolean flag1 = true;
        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if (ch !='0' && ch !='1'){
                flag1 = false;
                break;
            }
        }
        System.out.println(flag1);


    }
}
