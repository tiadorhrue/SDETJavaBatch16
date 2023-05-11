package class11;

public class E12DArrayOddNumbers {
    public static void main(String[] args) {

        int [][] arry={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int element;

        for (int row = 0; row < arry.length; row++) {
            for (int column = 0; column < arry[row].length; column++) {
                element=arry[row][column];
                if(element%2!=0){
                    System.out.println(element);
                }

            }

        }
    }
}
