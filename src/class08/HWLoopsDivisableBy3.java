package class08;

public class HWLoopsDivisableBy3 {

    public static void main(String[] args) {

        int i=1;

        while(i<=50)
        {if(i%3!=0)
            System.out.print(i+" ");
            i++;
        }
    }
}