package class24arraylist;

import java.util.ArrayList;

public class E6ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> makeup=new ArrayList<>();
        makeup.add("nailPolish");
        makeup.add("Lipstick");
        makeup.add("Blush");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apples");
        fruit.add("Banana");


        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(makeup);
        groceryList.addAll(fruit);
        System.out.print(groceryList);

    }
}
