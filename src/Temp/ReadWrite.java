package Temp;
import java.util.*;
public class ReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int proc = sc.nextInt();

        int cycle = 0;
        int read = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='R'){
                read++;
                if(read == proc){
                    cycle++;
                    read=0;
                }
            }
            else{
                if(read>0){
                    cycle++;
                    read=0;
                }
                cycle++;
            }
        }
        if(read > 0){
            cycle++;
        }
        System.out.println(cycle);
    }
}
