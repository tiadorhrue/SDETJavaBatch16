package class5;

import java.util.Scanner;

public class HWSmMedLar {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number that comes to mind between 1-1000");

        int number=scanner.nextInt();

        if (number<=10)
        {System.out.println("Small number");
        }
        else if(number<=100)
        {
            System.out.println("Medium number");
        }
        else if(number<=1000)
        {
            System.out.println("Large number");
        }
    }
}
