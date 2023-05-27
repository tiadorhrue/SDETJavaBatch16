package class04;

import java.util.Scanner;

public class E9ScannerBoolean {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you hungry? Enter true or false");

        boolean hungry=scanner.nextBoolean();

        if(hungry){ // true
            System.out.println("Let's order pizza");
        }
        else // false
        {
            System.out.println("Let's keep studying");
        }

    }
}
