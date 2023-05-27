package class05;

import java.util.Scanner;

public class HWCountryLanguage {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What's your country?");

        String country=scanner.next();

        switch(country) {

            case "United States": case "Canada":
                System.out.println("English");
            break;
            case "France":
                System.out.println("French");
            break;
            case "China": case "Singapore":
                System.out.println("Mandarin");
            break;
            case "Italy":
                System.out.println("Italian");
            default:
                System.out.println("Unknown");

        }
    }
}
