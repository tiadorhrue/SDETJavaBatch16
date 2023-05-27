package class25sets;

import java.util.ArrayList;
import java.util.HashSet;

public class E3HashSets {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

        HashSet<String> uniqueNames=new HashSet<>(); // won't allow you to print multiples of the same data in your list
        uniqueNames.add("Tia");
        uniqueNames.add("Tia");
        uniqueNames.add("Olivier");
        System.out.println(uniqueNames);

    }
}
