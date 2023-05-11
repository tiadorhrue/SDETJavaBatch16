package class19overload;

public class Math {

    static void add(int num,int numb){
        System.out.println(num+numb);
    }
    static void add(int num,double numb){
        System.out.println(num+numb);
    }
    static void add(double numb,int num){
        System.out.println(num+numb);
    }
    static void add(double num,double numb){
        System.out.println(num+numb);
    }
    static void add(long num,long numb){
        System.out.println(num+numb);
    }
    static void add(long num,long numb, int num1){
        System.out.println(num+numb);
    }

    public static void main(String[] args) {
        add(10,10);
    }
}
