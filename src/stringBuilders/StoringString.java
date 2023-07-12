package stringBuilders;


public class StoringString {

    public static void main(String[] args) {

//        String name = "Sohel Shaikh";
//        String naam = "Sohel Shaikh";
//
//        String a = new String("Sohel");
//        String b = new String("Sohel");
//
//        System.out.println(a.equals(b));
//        System.out.println(name.equals(naam));
//
//        System.out.println(naam==name);
//        System.out.println(a==b);

        //hashCode Are Always diff for each instance
        // hence this is one object that is point by 2 diff object.
//        System.out.println(naam.hashCode());
//        System.out.println(name.hashCode());

        String name = "Java";
        String newName ;

        for (int i = 0; i < name.length()-1; i++) {

            System.out.println(name.charAt(i));
        }
        newName = new String(name);
        System.out.println(newName.hashCode()+ ":" + name.hashCode());
        System.out.println(newName+""+ name);
        System.out.println(newName == name);
        System.out.println(newName.equals(name));

    }
}
