package class23interfaces;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Moncef");
        names.add("Olivier");
        names.add("Axel");
        names.add("Sarah");
        names.add("Tia");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Sarah"));
        System.out.println(names.get(0));

    }
}
