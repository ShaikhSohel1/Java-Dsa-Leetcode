package abstraction;

public class Child extends Parent{
    private String career;

    @Override
    public void career(String name){
        this.career = name;
    }


    public String getCareer(){
        return this.career;
    }


}
