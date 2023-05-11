package class5;

import java.util.Scanner;

public class HWBirthdayMonth {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your birthday month?");

        String season=scanner.next();

        switch(season) {

            case"March": case"April": case "May":
                System.out.println("You were born in the Spring");
            break;
            case "June": case "July": case "August":
                System.out.println("You were born in the Summer");
            break;
            case "September": case "October": case"November":
                System.out.println("You were born in the Fall");
            break;
            case "December": case "January": case "February":
                System.out.println("You were in the Winter");
        }

    }
}
