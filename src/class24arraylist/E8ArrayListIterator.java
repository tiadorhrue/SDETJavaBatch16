package class24arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class E8ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Coke");
        names.add("Coffee");
        names.add("Water");
        names.add("Juice");

        Iterator <String> iterator= names.iterator();

        while(iterator.hasNext()){
            String word=iterator.next(); // iterator.next(); == i++;
            if(word.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
