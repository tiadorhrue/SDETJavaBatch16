package class13;

public class Task2 {

    public static void main(String[] args) {
        String str="fe^&#$GJFVjek3902uu53%%38394&*#";

        // find how many characters are a part of the Alphabet
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1.length());


    }
}
