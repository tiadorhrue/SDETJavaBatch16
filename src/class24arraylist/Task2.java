package class24arraylist;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Coke");
        names.add("Coffee");
        names.add("Water");
        names.add("Juice");

        for (int i = 0; i < names.size(); i++) {
            String word=names.get(i);
            if(word.endsWith("e")){
                names.remove(i);
                i--;
            }

        }
        System.out.println(names);

    }
}
