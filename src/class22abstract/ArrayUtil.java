package class22abstract;

public interface ArrayUtil {
    public boolean searchArr(int [] array, int number);
}
class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] array, int number) {
        boolean numberFound=false;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==number){
                numberFound=true;
            }

        }
        return numberFound;
    }
}