package class18inherit;

public class A {

    static void printF(){
        System.out.println("F");
    }
}
class B extends A{
    public static void main(String[] args) {

        B b=new B();
        b.printF();

    }



}
class C extends B{}
