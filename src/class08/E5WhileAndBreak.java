package class08;

public class E5WhileAndBreak {

    public static void main(String[] args) {

        boolean summer=true;
        int temp=85;

        while(summer)
        { if(temp<100)
        {
            System.out.println("It is good! I Love Summer");
            temp++;
        }else {
            System.out.println("Its very hot");
            break;
        }



        }
    }
}
