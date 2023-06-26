package JavaPracticals;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableDemo {

    public static void main(String[] args) {


        Hashtable<String, Integer> hastable = new Hashtable<>();
        hastable.put("Boy1",111111111);
        hastable.put("Boy2",555555555);
        hastable.put("Boy3",999999999);

        System.out.println("Before Sorting: "+hastable);
        TreeMap<String,Integer> hastableSorted = new TreeMap(hastable);
        System.out.println("After Sorting : "+ hastableSorted);
    }
}

