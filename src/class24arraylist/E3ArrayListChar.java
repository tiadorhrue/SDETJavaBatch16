package class24arraylist;

import java.util.ArrayList;

public class E3ArrayListChar {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);

        System.out.println(characters.indexOf('E'));

        characters.set(0,'H');
        System.out.println(characters);

    }
}
