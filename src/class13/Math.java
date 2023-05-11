package class13;

public class Math {

    void add(int num1,int num2){

        System.out.println(num1+num2);
    }
    void multiply(int numb1, int numb2)
    {
        System.out.println(numb1*numb2);
    }

    public static void main(String[] args) {
        Math math=new Math();
        math.add(5,98);
        math.multiply(4,7);
    }
}
