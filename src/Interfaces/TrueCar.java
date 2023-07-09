package Interfaces;

public class TrueCar {
    private Engine engine;
    private Media Player = new CdPlayer();

    TrueCar(){
        engine = new PetrolEngine();
    }

    TrueCar(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        engine.start();
    }

    public void stopEngine(){
        engine.start();
    }

    public void startMusic(){
        Player.start();
    }

    public void stopMusic(){
        Player.start();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
