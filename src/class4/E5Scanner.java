package class4;

import java.util.Scanner;

public class E5Scanner {

    public static void main(String[] args) {
        /* Scanner is a class which knows how to
        take input from the keyboard. Non-primitive like String

        scan - a variable
        new - is a special keyword which creates the object of a class

        Scanner ()
        System.in - means we want to use the scanner class for taking the user input
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        // Calling the next meathod to take a String from the user
        String name=scan.next();
        System.out.println("Your are amazing "+name);

    }
}
