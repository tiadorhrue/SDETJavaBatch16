package class25sets;

import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        /*
        Create a Set in which you need to add names of the countries. In this set we want all objects
        to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Russia");
        countries.add("Canada");
        countries.add("Italy");
        countries.add("Mexico");
        System.out.println(countries);

        for (String c: countries){
            System.out.println(c);
        }


    }
}
