package class11;

public class E72DArray {

    public static void main(String[] args) {

        boolean[][] matrix = {

                {true, false, true, true, false},
                {true, false, false, false, false}
        };
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]) {
                    counter++;
                }


            }
            System.out.println(counter);
        }
    }
}
