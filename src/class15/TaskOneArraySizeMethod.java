package class15;

import java.util.Arrays;

public class TaskOneArraySizeMethod {

    int [] createArray(int size){
         int [] arr=new int [size];
        for (int i = 0; i < size ; i++) {
            arr[i]=10;

        }
        return arr;

    }

    public static void main(String[] args) {

        TaskOneArraySizeMethod obj=new TaskOneArraySizeMethod();
        int[] array = obj.createArray(5);


        System.out.println(Arrays.toString(array));
        // or
        for (int i : array) {
            System.out.println(i);

        }

    }
}
