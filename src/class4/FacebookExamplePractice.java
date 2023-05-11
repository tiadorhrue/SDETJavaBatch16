package class4;

import java.util.Scanner;

public class FacebookExamplePractice {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your username");
        String username= scan.next();

        if(username.equals("tiadivine96"))
        {
            System.out.println("You have been signed in!");}
        else
        {
            System.out.println("Your username is incorrect");
        }
    }
}
