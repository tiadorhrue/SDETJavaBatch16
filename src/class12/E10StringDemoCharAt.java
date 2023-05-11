package class12;

public class E10StringDemoCharAt {
    public static void main(String[] args) {
        String name="LEONARDO";
        int counter=0;


        // System.out.println(name.charAt(1));

        for (int i = 0; i < name.length(); i++) {

            if(name.charAt(i)=='R')
                counter++;

        }
        System.out.println(counter);
            }
}
