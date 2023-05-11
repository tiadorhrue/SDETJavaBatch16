package class11;

public class E52DArray {

    public static void main(String[] args) {
        int [][] arry = {
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5},
                {10,8,6,4,2}
        };

        int counter=0;

        for (int row = 0; row < arry.length ; row++) {
            for (int col = 0; col < arry[row].length; col++) {
                if(arry[row][col]%2==0)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
