package Basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float principle,rate,sinterest;
        int time;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter THe principle\nrate\nTime(In Years)");
        principle=input.nextFloat();
        rate=input.nextFloat();
        time=input.nextInt();
        sinterest= (float) ((principle*rate*time)/100.0);
        System.out.println("principle:"+principle+"\nrate:"+rate+"\nTime(In Years):"+time);
        System.out.println("Simple Intrest: "+sinterest);

        IsPrime obj = new IsPrime(13);
        System.out.println(obj.isPrime());

    }

    public static class IsPrime{
        int num;
        IsPrime(int num){
            this.num=num;
        }

        public boolean isPrime(){
            for (int i = 2; i < num; i++) {
                if(num%i==0) {
                    return false;
                }
            }
            return true;
        }

    }
}


