package class24arraylist;

import java.util.ArrayList;

public class E7ArrayListRemoveAll {
    public static void main(String[] args) {
        ArrayList<String> grocery=new ArrayList<>();
        grocery.add("nailPolish");
        grocery.add("Lipstick");
        grocery.add("Blush");
        grocery.add("Apples");
        grocery.add("Banana");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apples");
        fruit.add("Banana");
        System.out.println(grocery);
        grocery.removeAll(fruit);
        System.out.println(grocery);


    }
}
