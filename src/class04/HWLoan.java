package class04;

import java.util.Scanner;

public class HWLoan {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Enter loan Amount");

        int loan=scan.nextInt();

        if (loan<=200000)
        {System.out.println("Loan Accepted");}
        else
        {System.out.println("Loan Rejected");}

    }
}
