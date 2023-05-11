package class9;

public class E8Arrays {

    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int j = 5; j >= 0; j--) {
            System.out.print(chars[j] + " ");

        }
        int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int sum = 0;

        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j) {

                sum = sum + array_variable[i][j];

            }

        }

        System.out.print(sum / 5);}}




