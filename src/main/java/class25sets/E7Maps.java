package class25sets;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {

        HashMap<String,Double> grocery=new HashMap<>();
        grocery.put("Apple",1.50);
        grocery.put("Banana",.50);
        grocery.put("Soap",2.59);
        grocery.put("Milk",12.50);
        grocery.put("Apple",4.50);

        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(4.5));
        System.out.println(grocery.isEmpty());






    }
}
