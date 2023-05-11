package class14;

public class TaskOneMaxNumber {

    void printLarger(int num, int num2) {
        System.out.println(Math.max(num, num2)); // This will print out the max number

    }

    public static void main(String[] args) {
        TaskOneMaxNumber obj=new TaskOneMaxNumber();
        obj.printLarger(40,50);
    }
}
