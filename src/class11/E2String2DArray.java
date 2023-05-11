package class11;

public class E2String2DArray {

    public static void main(String[] args) {

        String [][] matrix={
                {"Sarah","Artem","Lean","Semir"},
                {"Farwa","Halima","Alina","Tiadorh"}
        };
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");

            }

        }
        System.out.println();

      }
}
