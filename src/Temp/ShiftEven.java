package Temp;
import java.util.*;

public class ShiftEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] result = str.toLowerCase().toCharArray();
//        System.out.println(result);

        for(int i=1; i<str.length(); i+=2){
            result[i] = shift(result[i-1],  result[i]-'0');
        }
        System.out.println(result);
    }

    public static char shift(char c, int x) {
        return (char)((c-'a'+x)%26 +'a');
    }
}
