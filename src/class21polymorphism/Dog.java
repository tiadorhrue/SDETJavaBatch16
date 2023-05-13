package class21polymorphism;

public class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void eat(){
        System.out.println("Eats kibble");
    }
    void run(){
        System.out.println("Dog runs fast");
    }
}
class Cat extends Dog{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
}
class Horse extends Cat{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
}

