package class24arraylist;

import java.util.ArrayList;

public class Task3 {
    /*
    Crate an arrayList of drinks call it. If any drink has letter "a" or "e"
    replace it with water
     */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList();

        drinks.add("Coca Cola");
        drinks.add("Margarita");
        drinks.add("Sprite");
        drinks.add("Martini");

        drinks.removeIf(word -> word.endsWith("e") || word.endsWith("a"));
        System.out.println(drinks);
    }

}
