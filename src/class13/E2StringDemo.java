package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="dnjksKnJNC32938^&%^%";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","/"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[a-zA-Z]","%"));


    }

}
