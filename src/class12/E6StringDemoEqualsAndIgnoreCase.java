package class12;

public class E6StringDemoEqualsAndIgnoreCase {
    public static void main(String[] args) {

        String name="Justin";

        System.out.println(name.equals("Axel"));
        System.out.println(!name.equals("Justin"));
        System.out.println(name.equals("Justin"));
        System.out.println(name.equalsIgnoreCase("JUSTIN"));
    }
}
