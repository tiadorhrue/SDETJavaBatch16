package class25sets;

import java.util.TreeSet;

public class E5TreeSets {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>(); // will sort in alphabetical or numerical order order
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
