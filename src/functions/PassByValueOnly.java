package functions;

// only primitive data type will pass by value
public class PassByValueOnly {
        static int a=80;
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {

        }
        swap(a,b);
        System.out.println(a+" "+b); //Not going to swap coz its actually passing value ;

        Integer i=10;
        Integer i2=20;
        swapI(i,i2);
        System.out.println(i+" "+i2);

    }

     static void swapI(Integer nums1, Integer nums2) {
         Integer temp;
         temp=nums1;
         nums1=nums2;
         nums2=temp;
     }


    static void swap(int num1, int  num2) {
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
    }
}
