package polymorphism;

public class Traingle extends Shapes{
    // This will run when object of traingle is created
    // hence it is overriding the parent area() methode
    //
    @Override  // annotation(use for check)
    void area(){
        System.out.println("I am In Traingle Class");
    }
}
