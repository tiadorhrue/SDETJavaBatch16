package class20override;

public class Animal {
    static String name;
    static String color;
    static int height;

    void eat(){
        System.out.println("Munchh munch munchh");
    }
    void sleep(){
        System.out.println("ZzzzZZZZzzz");
    }
   void printInfo(){
        System.out.println(name+" "+color+" "+height);
    }

    Animal(String name,String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;

    }
    Animal(String name,String color) {
        this.name = name;
        this.color = color;
        this.height = 50;

    }
    Animal(String name) {
        this.name = name;
        this.color = "Brown";
        this.height = 42;

    }
}
