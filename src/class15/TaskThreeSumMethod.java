package class15;

public class TaskThreeSumMethod {
    int sumArr(int [] arr ){
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];

        }

        return sum;
    }

    public static void main(String[] args) {
        TaskThreeSumMethod obj=new TaskThreeSumMethod();
        int [] array={5,10,15,20};
        int i = obj.sumArr(array);
        //int sum=obj.sumArr(new int []{5,10,15,20})
        System.out.println(i);

    }
}
