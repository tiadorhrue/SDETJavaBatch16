package class05;

import java.util.Scanner;

public class HWGrades {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your quiz grades");
        int quizGrade= scanner.nextInt();
        System.out.println("Please enter your mid term grades");
        int midTermGrade= scanner.nextInt();
        System.out.println("Please enter your final grades");
        int finalGrades= scanner.nextInt();

        int averageGrade=quizGrade+midTermGrade+finalGrades/3;


        if(averageGrade>=90)
        {
            System.out.println("You got an A!");
        }else if(averageGrade>=70&&averageGrade<=90)
        {
            System.out.println("Your grade is a B");
        }else if(averageGrade>=50&&averageGrade<=70)
        {
            System.out.println("Your grade is a C");
        }else if(averageGrade<=50)
        {
            System.out.println("You Failed");
        }


    }
}
