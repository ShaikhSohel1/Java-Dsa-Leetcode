package Basic;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
      String a="Hi";
      String b=new String("Hi"); // both are same value
    /*
    * == is operator and will compare the location {
    *  String a="Hi";
    *  String b="Hi";
    * wil give true
    * }
    *
    * .equals is method and will compare actual object(content)
    */
//        System.out.println(a.equals(b) ?1:0);
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
}