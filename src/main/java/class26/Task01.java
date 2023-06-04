package class26;

import java.util.LinkedHashMap;

public class Task01 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> buildingfl=new LinkedHashMap<>();
        buildingfl.put(1,"Google");
        buildingfl.put(2,"Syntax");
        buildingfl.put(3,"Instagram");
        buildingfl.put(4,"Microsoft");
        buildingfl.put(5,"Best Buy");
        buildingfl.put(6,"Hulu");
        buildingfl.put(7,"Netflix");
        buildingfl.put(8,"Netflix");

        System.out.println(buildingfl.size());
        buildingfl.replace(4,"Amazon");
        buildingfl.remove(7);
        System.out.println(buildingfl);


    }
}
