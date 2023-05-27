package class23interfaces;

public interface Person {
    // you can inherit interfaces
    void eat();
}
interface Employee extends Person{
    void work();
}
class Tester implements Employee {

    @Override
    public void eat() {
        System.out.println("Testers don't eat");}

    @Override
    public void work() {
        System.out.println("Testers make developers work harder");}
}