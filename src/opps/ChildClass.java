package opps;

public class ChildClass extends Inheritence {
    int weigth;

    public  ChildClass(){ }

    public ChildClass(int weigth) {
        this.weigth = weigth;
    }

    public ChildClass(int l, int h, int weigth) {
        super(l, h);
        this.weigth = weigth;
    }
}




