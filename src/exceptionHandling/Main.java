package exceptionHandling;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        int a=1;
        int b=0;
        try {
            if(b != 0){
                int c = a/b;
            }
            else throw  new ArithmeticException("Divide By Zero");


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This Will Always Executed");
        }
    }
}
