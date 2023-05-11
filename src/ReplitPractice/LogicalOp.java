package ReplitPractice;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {

        int [] arry =new int [5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int rev=scanner.nextInt();

        for (int i = arry.length ; i >= 0; i--) {
            arry[0]=rev;
            System.out.println(arry[i]);}

    }

    }
