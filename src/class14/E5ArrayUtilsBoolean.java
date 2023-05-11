package class14;

public class E5ArrayUtilsBoolean {

    boolean contains(int [] arr, int number )
    {boolean isFound=false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==number) {
                isFound=true;
                break;
            }
        }
        return isFound;
    }


    public static void main(String[] args) {

        E5ArrayUtilsBoolean obj=new E5ArrayUtilsBoolean();
        int num=20;
        int [] array={10,25,45};
        boolean tOrF=obj.contains(array,num);
        System.out.println(tOrF);


    }
}
