package class8;

import java.util.Scanner;

public class E1WhileLoopScanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the start number");
        int startNumber= scanner.nextInt();
        System.out.println("Enter the ending number");
        int endingNumber= scanner.nextInt();

        while(startNumber<=endingNumber)
        {
            System.out.print(startNumber+" ");
            startNumber+=2;
        }
        System.out.println();

        Scanner fetch=new Scanner(System.in);

        System.out.println("Enter the start number, ending number and step");
        int startNum= scanner.nextInt();
        int endingNum= scanner.nextInt();
        int step=scanner.nextInt();

        while(startNum<=endingNum)
        {
            System.out.print(startNum+" ");
            startNum=startNum+step;
        }




    }
}
