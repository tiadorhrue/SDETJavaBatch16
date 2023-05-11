package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");

        int value= scanner.nextInt();

        int counter=1;

        while(counter<=value)
        {
            System.out.print(counter+" ");
            value++;
        }
    }
}
