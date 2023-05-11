package class12;

public class E12StringDemo {

    public static void main(String[] args) {

        //subString is used to get a part of the complete string
        // will read everything after the index
        // if you choose a last index that index you select will not be printed but everything before will

        String sentence="Yup we have another class";

        System.out.println(sentence.substring(4));
        System.out.println();
        System.out.println(sentence.substring(7,11));

    }
}
