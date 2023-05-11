package class13;

public class ArrayUntil {

    public static void main(String[] args) {
        int[] arr={10,20,45,89};
        int number=100;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]== number)
            {
                System.out.println("Yes");
            }

            ArrayUntil array=new ArrayUntil();
            array.searchArray(arr,number);

        }
    }
    void searchArray(int[] arr, int number){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==number){
                System.out.println("Yes");
                break;
            }

        }
    }
}
