package class22abstract;

public class FindNumber {
    public int num(int [] arr){
        int found=0;
        int target=10;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                found=found+arr[i];

            }
        }
        return found;

    }

}
