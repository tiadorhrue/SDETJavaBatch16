package class24arraylist;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tia");
        names.add("Luis");
        names.add("Olivier");
        names.add("Astro");
        names.add("Saph");

        System.out.println(names);

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Tia"));
        System.out.println(names.size());


    }

}
