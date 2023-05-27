package class04;

import java.util.Scanner;

public class E11ScannerNextLine {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("When did you move here?");
        /*
        If we want to take a complete line from the user
        we should use next line method
         */
        String sentence=scanner.nextLine();
        System.out.println(sentence);
    }
}
