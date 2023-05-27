package class04;

import java.util.Scanner;

public class E10ScannerChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender");
        /*
        This is no direct method for the char datatype in scanner class
        so we use a workaround where we first use the next method to take a
        String from rhw user and from that String we extract the first letter
        by passing 0 to the charAt() method
         */

        char gender = scanner.next().charAt(0); // 0 is asking for the first letter of the string entered
        System.out.println("you entered " + gender);
    }
    }

