package opps;

import access.A;

public class Main {
    String name;
    public static void main(String[] args) {
        HumanStaticExample sohel = new HumanStaticExample(21,"sohel",false);
        HumanStaticExample shoaib = new HumanStaticExample(19,"shoaib",true);

//        System.out.println(sohel.population);
//        System.out.println(shoaib.population);
//        Main obj = new Main("sohel ");
//        Main obj1 = new Main("shoaib ");
//        obj.greeting();
//        obj1.greeting();
//        Singleton obj = Singleton.getInstance();
//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj3 = Singleton.getInstance();

        ChildClass obj = new ChildClass(5,4,3);
        System.out.println(obj.h + " " + obj.weigth);
        ThirdClass obj2 = new ThirdClass(4,5,6,"helo");
        System.out.println(obj2.h+" "+obj2.weigth+" "+obj2.str);
        A obj4 = new A();
        System.out.println(obj4.getNum());

    }

    public Main(String name) {
        this.name = name;
    }


    void greeting(){
        System.out.println("hello There!"+name);
    }

      void fun(){
//        Main obj = new Main("shaoib");
        greeting();
    }
}
