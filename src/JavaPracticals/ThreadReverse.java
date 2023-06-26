package JavaPracticals;

public class ThreadReverse {

    public static void main(String[] args) {
       try {

           Thread demoThread = Thread.currentThread();
           System.out.println(demoThread);
           demoThread.setName("Reverse Thread");
           System.out.println(demoThread);
           for (int i = 1; i <= 100; i++) {
               System.out.println(i);
               Thread.sleep(1000);

           }
       }

       catch (InterruptedException e){
           System.out.println("Thread Error");
       }
    }
}
