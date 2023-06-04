package class26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E1Maps {
    public static void main(String[] args) {
        Map<String, Double> drinks=new HashMap<>();
        drinks.put("Coke",2.0);
        drinks.put("Milk",5.0);
        drinks.put("Mango Juice",2.5);
        drinks.put("Coffee",3.0);
        drinks.put("Tea",3.5);

        drinks.values();
       //  drinks.values().removeIf(x->x>3.0); - return value

       //  drinks.keySet().removeIf(x->x.contains("i")); - return String
        System.out.println(drinks);

        // to display both keys and value
        drinks.entrySet();

        Set<Entry> entrySet=new HashSet<>();
        entrySet.add(new Entry("Coke",2.0));
        entrySet.add(new Entry("Milk",5.0));
        entrySet.add(new Entry("Mango Juice",2.5));
        entrySet.add(new Entry("Coffee",3.0));
        entrySet.add(new Entry("Tea",3.5));

        for(Entry e : entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println(entrySet);


    }

}
