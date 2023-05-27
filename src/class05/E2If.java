package class05;

import java.util.Scanner;

public class E2If {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Is it time for break? Enet true or false");
        boolean isBreak=scanner.nextBoolean();

        if(isBreak){
            System.out.println("Lets have a break");

        }
    }
}
