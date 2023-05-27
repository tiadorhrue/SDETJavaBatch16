package class25sets;

import java.util.LinkedHashSet;

public class E4LinkedHashSets {
    public static void main(String[] args) {

        LinkedHashSet<String> fruit=new LinkedHashSet<>(); // maintains the same order but still no duplicates
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("mango");
        System.out.println(fruit);
    }
}
