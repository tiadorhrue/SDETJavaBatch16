package class9;

public class E11Arrays {
    public static void main(String[] args) {







        /*
        There are two ways of creating arrays
        new int[5] - create an array of int with size 5
         */

        int[] numbers= new int[5];
        int num=10;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=num;
            num=num+10;
        }
        /*
        numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;

        for (int number : numbers) {
            System.out.println(number);

        }*/

    }
}
