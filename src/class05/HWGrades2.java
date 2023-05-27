package class05;

import java.util.Scanner;

public class HWGrades2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("Whats your grade?");

        char grade=scanner.next().charAt(0);

        if(grade=='A')
        {
            System.out.println(grade+" - Excellent");
        }else if(grade=='B')
        {
            System.out.println(grade+" - Good");
        }else if (grade=='C')
        {
            System.out.println(grade+" - Average");
        }else if (grade=='D')
        {
            System.out.println(grade+" - Bad");
        }else
        {
            System.out.println("Not acceptable");
        }
    }
}
