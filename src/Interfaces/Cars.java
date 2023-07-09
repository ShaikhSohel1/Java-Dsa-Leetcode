package Interfaces;

public class Cars implements Engine,Brake,Media{
    @Override
    public  void  start(){
        System.out.println("I start engine normal");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine Normal");
    }

    @Override
    public  void acc(){
        System.out.println("Engine Accelerate");
    }

    @Override
    public void brake(){
        System.out.println("Normal Brake");
    }
}
