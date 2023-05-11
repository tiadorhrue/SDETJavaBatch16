package class4;

import java.util.Scanner;

public class E8ScannerMultiple {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary=scanner.nextInt();

        if(salary>100000)
        {
            System.out.println("You are Rich");
        }
        else {
            System.out.println("You need a new job");
        }



    }
}
