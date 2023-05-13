package class20override;

public class Parent {
    void getMarried(){
        System.out.println("You marry who I chose");
    }
    private void bankAccess(){
        System.out.println("It's my money");
    }
    static void printNumber(){
        System.out.println(10);
    }

}
class Axel extends Parent{
    void getMarried() {
        System.out.println("I want to marry Karol");
    }

    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarried();

    }
}
