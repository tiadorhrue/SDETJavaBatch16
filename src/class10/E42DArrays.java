package class10;

public class E42DArrays {

    public static void main(String[] args) {

        int[][] matrix = {
                {10,20,30,40,50}, // 5 elements// index 4
                {20,50,65,20}, // 4 elements // index 3
                {102,54,60}, // 3 elements // index 2
                {20,55}

        };

        for (int row = 0; row < matrix.length ; row++) {

// matrix[i] == will return the completed 1D array at the index specified but the value of i

            for (int column = 0; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+" " );

            }
            System.out.println();

        }



    }
}
