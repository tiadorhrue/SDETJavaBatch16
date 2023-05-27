package class20override;

public class Grandpa {
    double money=150;
}
class Father extends Grandpa{
    double money=100;

}
class Child extends Father{
    void printMoney(){
        System.out.println(super.money); // super goes up one level to parent class
    }
}
class Tester{
    public static void main(String args []) {
        Child ch=new Child();
        ch.printMoney();
    }
}