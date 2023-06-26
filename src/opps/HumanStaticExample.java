package opps;

 public   class HumanStaticExample {
    int age;
    String name;
    boolean married;

    static long population;

    public static void main(String[] args) {

    }


    public HumanStaticExample(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
        HumanStaticExample.population+=1;
    }


}
