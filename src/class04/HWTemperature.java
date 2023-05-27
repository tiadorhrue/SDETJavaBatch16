package class04;

import java.util.Scanner;

public class HWTemperature {

    public static void main(String[] args) {

        double fehrenheit, celsius;

        Scanner scanner = new Scanner(System.in);
        {System.out.println("Please enter your temperature and city");}

        fehrenheit = scanner.nextDouble();
        celsius = (fehrenheit - 32) * (0.5556);

        String city = scanner.next();
        {System.out.println("The temperature in " + city + " is " + celsius + " degrees celsius.");}
    }
}
