package class13;

import java.util.Scanner;

public class MethodTester {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println();

        // ========================================================

       E9Methods obj=new E9Methods();
       obj.printSomething();
        System.out.println();

        //=====================

        E9Methods.printWord("Darko");

        // ==============================

      E9Methods.printWordManyTimes("Tia",15);

    }
}
