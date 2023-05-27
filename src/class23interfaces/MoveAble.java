package class23interfaces;

public interface MoveAble {
    /*
    interface is a blueprint / guide / contract to make sure everyone is on the same page
    Also allows you to achieve polymorphism
     */
    int age=12; // public static final int age
    void move(); // interfaces are public by default
}
interface WashAble{
    // you can have multiple interfaces in one class
    void wash();
}
class Dog implements MoveAble, WashAble {
    @Override
    public void move() {
        System.out.println("Moving.....");

    }
    @Override
    public void wash() {
        System.out.println("You can wash me...");
    }
}
class Cat implements MoveAble{
    @Override
    public void move() {
        System.out.println("Cats can also move");
    }
}
class Horse implements MoveAble{
    public void move() {
        System.out.println("Cats can also move");
    }
}