package class08;

public class E3ForLoopSum {

    public static void main(String[] args) {

        int sum=0; // initialize the sum first with a number that doesn't affect the operator

        for (int i = 1; i <=10; i++) {
            if(i%2==0){
                sum=sum+i; // sum+=1
            }
        }

        System.out.println(sum);// print outside of the loop when you only want one/final result
    }
    }

