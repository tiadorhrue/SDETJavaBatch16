package class26;

import java.util.Set;
import java.util.TreeMap;

public class Task02 {
    public static void main(String[] args) {
        TreeMap<String,String> countriesCapitals = new TreeMap<>();
        countriesCapitals.put("Washington DC","America");
        countriesCapitals.put("La Paz","Bolivia");
        countriesCapitals.put("Prauge","Czech Republic");
        countriesCapitals.put("Paris","France");
        countriesCapitals.put("Buenos Aires","Argentina");


        for (String c: countriesCapitals.keySet()) { // printing the KEYS
            System.out.print(c+" ");}
        System.out.println();

        for(String v: countriesCapitals.values() ){ // printing the VALUES
            System.out.print(v+" ");
        }

        System.out.println();
        System.out.println("******************");

        for(var e : countriesCapitals.entrySet()){
            System.out.println(e);
        }
        System.out.println("******************");

        System.out.println(countriesCapitals);

        System.out.println("******************");

        Set<String>capital=countriesCapitals.keySet();
        System.out.println(capital);
        // or
        System.out.println(countriesCapitals.keySet());






    }
}
