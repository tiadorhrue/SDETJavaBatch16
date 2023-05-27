package class24arraylist;

import java.util.ArrayList;

public class E9ArrayRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Coke");
        names.add("Coffee");
        names.add("Water");
        names.add("Juice");

        /* names.removeIf((String word) -> word.endsWith("e"));
           names.removeIf(x -> x.endsWith("e"));
         */

        names.removeIf( word -> word.endsWith("e"));
        System.out.println(names);
    }
}
