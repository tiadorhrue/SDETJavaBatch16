package class21polymorphism;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void speak() {
        System.out.println("Animal speaks");
    }
}
