package class3;

public class E7StringConcat {

    public static void main(String[] args) {
        System.out.println("Leo"+10+10);
        System.out.println(10+10+"Leo");
        System.out.println("Leo"+(10+10));

        // left to right rule is not applicable in math when using PEMDAS

        System.out.println(2+2*2);
        System.out.println((2+2)*2); // Java follows PEMDAS


    }
}
