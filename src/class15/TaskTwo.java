package class15;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class TaskTwo {
    boolean isPalindrome (String word){
        String revWOrd = "";
        for(int i=word.length()-1; i >=0 ; i--)
        { revWOrd = revWOrd + word.charAt(i); }
        boolean isWrdPali=false;
        if(word.equalsIgnoreCase(revWOrd)){
            isWrdPali=true;
        }
        return isWrdPali;
    }

    public static void main(String[] args) {

        TaskTwo obj=new TaskTwo();
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();


        boolean isOrIsNot =obj.isPalindrome(givenString);
        System.out.println(isOrIsNot);
    }
}
