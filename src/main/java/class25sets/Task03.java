package class25sets;

import java.util.TreeSet;

public class Task03 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order in maintained.
        Then remove any city that starts with A.
         */

        TreeSet <String> city=new TreeSet<>();
        city.add("Atlanta");
        city.add("Anapolais");
        city.add("Los Angelos");
        city.add("New York");
        city.add("Dallas");
        city.add("Chicago");
        city.add("Clifton");

        for (String c : city){
            if(!c.startsWith("A")){
                System.out.println(c);
            }
        }
    }
}
