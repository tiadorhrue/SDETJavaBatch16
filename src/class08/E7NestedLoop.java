package class08;

public class E7NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i <3 ; i++) { // this condition tells java how many loops you want
            for (int j = 0; j <5 ; j++) // inner loop request the output you want
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
