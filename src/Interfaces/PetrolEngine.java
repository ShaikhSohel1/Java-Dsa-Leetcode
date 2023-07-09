package Interfaces;

public class PetrolEngine implements Engine{

    @Override
    public void start(){
        System.out.println(" Start Petrol Engine");
    }

    @Override
    public void stop(){
        System.out.println(" Stop Petrol Engine");
    }

    @Override
    public void acc(){
        System.out.println(" Accelerate Petrol Engine");
    }
}
