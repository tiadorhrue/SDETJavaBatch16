package class22abstract;

public class AnimalTester {
    public static void main(String[] args) {

        class22abstract.Animal[] animals={new class22abstract.Dog("Max","Brown","German"),
                            new class22abstract.Cat("Lucy","White","Persian"),
                            new class22abstract.Horse("York","Black","Stallion")
        };

        for(class22abstract.Animal ani : animals){
          ani.eat();
          ani.sleep();
          ani.speak();
            System.out.println();

        }

    }
}
