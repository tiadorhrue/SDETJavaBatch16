package class14;

public class E4ArrayUtils {

    /*
    return type=> int
    name of the method => add
    parameters => (int a, int b)
    body of the method => {
    int sum=a+b;
    return sum;
     */

    int add(int a, int b)   // this is initializing the "add" variable
    {int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj=new E4ArrayUtils();
        int result=obj.add(10,20);
        System.out.println(result);
    }



}
