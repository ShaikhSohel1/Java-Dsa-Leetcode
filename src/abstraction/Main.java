package abstraction;

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.career("Doctor");
        System.out.println(obj.getCareer());
    }
}
