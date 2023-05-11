package ReplitPractice;

import java.util.Scanner;

public class Rep {

    public String alphabetical (String str)
    {char str1='a';
        char greater='.';
        String strr="";
        for (int i = 1 ; i < str.length(); i++)
        {
            str1=str.charAt(i);
            if(str1>greater)
            { greater=str1;
                strr=strr+greater;}

        }
        return strr;
    }

    public static void main(String[] args){
        Rep obj=new Rep();
        String strr=obj.alphabetical("language");
        System.out.println(strr);



    }


}








