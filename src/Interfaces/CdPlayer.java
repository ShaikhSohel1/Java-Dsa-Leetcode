package Interfaces;

public class CdPlayer implements Media {

    @Override
    public  void start(){
        System.out.println("Started Music PLayer");
    }

    @Override
    public void stop(){
        System.out.println("Stopped Music Player");
    }
}
