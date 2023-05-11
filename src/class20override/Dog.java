package class20override;

public class Dog extends class20override.Animal {


    Dog(String name, String color, int height) {
        super(name, color, height);
    }

    void sleep(){
        System.out.println("I like to sleep for 10.6 hours");
    }
}
class Cat extends class20override.Animal {


    Cat(String name, String color, int height) {
        super(name, color, height);
    }
}
class Horse extends Animal {


    Horse(String name, String color, int height) {
        super(name, color, height);
    }


    public static void main(String[] args) {
       Dog dog=new Dog("Max","Brown",32);
       dog.printInfo();
       dog.sleep();

       Cat cat=new Cat("Maxie","Black",42);
       cat.printInfo();
       cat.eat();

       Horse horse=new Horse("Maxel","Blue",70);
       horse.printInfo();
       horse.eat();

    }
}
