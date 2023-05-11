package class7;

public class E11WhileLoopModulus {
    public static void main(String[] args) {
       int counter=1;

       while(counter<=100){
               System.out.print(counter+" ");
           counter++;

       }

        System.out.println();

       int counter1=20;
       while(counter1<=100)
       {
           System.out.print(counter1+" ");
           counter1+=2;
       }

        System.out.println();

       int counter2=100;
       while(counter2>=1)
       {if(counter%2!=0) // if you have to use modulus always use if
           System.out.print(counter2+" ");
           counter2--;
       }

    }
}
