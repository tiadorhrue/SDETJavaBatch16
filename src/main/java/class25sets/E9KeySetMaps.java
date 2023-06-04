package class25sets;

import java.util.Set;
import java.util.TreeMap;

public class E9KeySetMaps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();

        makeup.put("Lipstick",100.00);
        makeup.put("Blush",68.0);
        makeup.put("EyeLiner",25.0);
        makeup.put("Foundation",120.0);
        makeup.put("Highlighter",75.5);

        Set<String> keys=makeup.keySet();
        System.out.println(keys);

        var key= makeup.values();


    }
}
