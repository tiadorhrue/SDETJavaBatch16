package class6;

import java.util.Scanner;

public class E3LogicalOperators {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("How tall are you in inches?");
        int height=scanner.nextInt();

        if(height<60)
        {
            System.out.println("You're short");
        }
        else if(height<=60&&height<=72)
        {
            System.out.println("You're average height!");
        }
        else if(height>72)
        {
            System.out.println("You are tall! Women will love you");
        }



    }
}
