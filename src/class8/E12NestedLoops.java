package class8;

public class E12NestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            for (int k = 2; k <=6; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
            for (int y = 3; y <=7 ; y++) {
                System.out.print(y+" ");

            }
            System.out.println();


            for (int r = 0; r < 3; r++) {
                for (int w = 1; w <=5; w++) {
                    System.out.print(w+r+" ");

                }
                System.out.println();

            }
        }

    }
}
