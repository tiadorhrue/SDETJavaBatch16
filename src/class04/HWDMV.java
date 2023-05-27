package class04;

import java.util.Scanner;

public class HWDMV {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        {System.out.println("How old are you?");}

        int age= scan.nextInt();

        if(age>=18)
        {
            System.out.println("You will be issues a Drivers License");
        }
        else
        {
            System.out.println("You will be issues a Learners Permit");
        }
    }
}
