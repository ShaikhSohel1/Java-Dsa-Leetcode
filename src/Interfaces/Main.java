package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Cars car = new Cars();
//
//        car.start();
//        car.stop();

        TrueCar BMW = new TrueCar();
        BMW.startEngine();
        BMW.startMusic();
        BMW.upgradeEngine();
        BMW.stopEngine();
    }

}
