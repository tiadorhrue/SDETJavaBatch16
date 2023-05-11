package class4;

public class E4ElseIfString {

    public static void main(String[] args) {

        String fruit="Mango";

        if(fruit.equals("Orange"))
        {System.out.println("You have to pay $12");}
        else if (fruit.equals("Banana"))
        {System.out.println("You have to pay $5");}
        else if (fruit.equals("Apples"))
        {System.out.println("You have to pay $4");}
        else
        {System.out.println("This fruit is not available");}

        String fruit1="Mango";

        if(fruit1.equals("Orange"))
        {System.out.println("You have to pay $12");}

        else if (fruit1.equals("Banana"))
        {System.out.println("You have to pay $5");}

        else if (fruit1.equals("Apples"))
        {System.out.println("You have to pay $4");}

        else
        {System.out.println("This fruit is not available");}
    }
}
