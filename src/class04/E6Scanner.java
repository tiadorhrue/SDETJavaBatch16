package class04;

import java.util.Scanner;

public class E6Scanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please Enter Your Name");
        String name=scanner.next();

        if(name.equals("Elana"))
        {
            System.out.println("Mac User");
        }
        else {
            System.out.println("Windows User");
        }


    }
}
