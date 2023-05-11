package class3;

public class E6StringConcat {
    public static void main(String[] args) {

        String firstName="Leo";
        String lastName="Neo";
        String fullName=firstName+lastName;
        System.out.println(fullName);
        String text=firstName+10;
        System.out.println(text); // results will always be a string

        System.out.println("Leo"+10+10); // remember java reads left to right making the outcome a String
    }
}
