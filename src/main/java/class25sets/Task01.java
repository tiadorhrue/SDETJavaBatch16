package class25sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        ArrayList<String> aList=new ArrayList<>();

        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> liList=new LinkedHashSet<>(aList);
        System.out.println(liList);


    }
}
