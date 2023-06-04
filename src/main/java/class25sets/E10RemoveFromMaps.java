package class25sets;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E10RemoveFromMaps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();

        makeup.put("Lipstick",100.00);
        makeup.put("Blush",68.0);
        makeup.put("EyeLiner",25.0);
        makeup.put("Foundation",120.0);
        makeup.put("Highlighter",75.5);

        Set<String> keys = makeup.keySet();
        keys.removeIf(x -> x.contains("a"));
        System.out.println(makeup);

        Collection<Double> values= makeup.values();
        values.removeIf(v->v>80);
        System.out.println(makeup);

    }
}
