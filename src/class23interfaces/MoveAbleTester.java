package class23interfaces;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveable=new Horse();
        WashAble washable=new Dog();
        MoveAble[] moveAbles={new Cat(),new Dog()};

        for (MoveAble m: moveAbles){
            m.move();
        }

    }
}
