package class14;

public class E2ArrayManipulator {
    int sumArr(int[] arr ) {
        int sum = 0;
        for (int num : arr) {
            sum+= num;
        }
        return sum;

    }

    public static void main(String[] args) {

        E2ArrayManipulator obj=new E2ArrayManipulator();
        int [] array={10,20,30};
        int result=obj.sumArr(array);
        System.out.println(result);
        /*
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextLine();

         */

        
    }
}
