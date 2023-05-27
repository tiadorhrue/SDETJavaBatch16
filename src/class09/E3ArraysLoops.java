package class09;

public class E3ArraysLoops {
    public static void main(String[] args) {


        double[] num={10.5,5.5,0.05,100.5,586};
        System.out.println(num.length); // .length will tell you how man values you have in your array
/*
        The long way
        System.out.println(num[i]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
*/

        // With a loop
        for(int j=0;j<num.length;j++)
        {
            System.out.print(num[j]+" ");

        }


    }
}
