package class05;

import java.util.Scanner;

public class HWCalculator {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNum=scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNum=scanner.nextDouble();
        System.out.println("Enter your operator");
        char operator=scanner.next().charAt(0);



        switch(operator){
            case '+':
            System.out.println(firstNum+secondNum);
            break;
            case '-':
            System.out.println(firstNum-secondNum);
            break;
            case '*':
            System.out.println(firstNum*secondNum);
            break;
            case '/':
            System.out.println(firstNum/secondNum);
            break;
        }


    }
}
