package class22abstract;

public abstract class Animal {

    private String name;
    private String color;
    final String breed;

    Animal(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }
   abstract void eat();

    void speak(){
        System.out.println("Animal speaks");
    }
    void sleep(){
        System.out.println("zzzZZZzz");
    }

}
class Dog extends Animal{

    Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void eat() {
        System.out.println("Eats kibble");
    }

    @Override
    void speak(){
        System.out.println("Bark!");
    }
    void sleep(){
        System.out.println("Sleeps in cage");
    }

}
class Cat extends Animal{
    Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void eat() {
        System.out.println("Eats salmon and tuna");
    }
    void speak(){
        System.out.println("Meowww");
    }
}
class Horse extends Animal{
    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void sleep() {
        System.out.println("Sleep standing up");
    }

    @Override
    void eat() {
        System.out.println("Eats hay");
    }

    void speak(){
        System.out.println("Naaaa naaaa");
    }
}