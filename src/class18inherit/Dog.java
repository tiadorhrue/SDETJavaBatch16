package class18inherit;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;



    Dog(String name,String color, String breed, int age, double weight){
        /*this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;*/
        this(name, color, breed, age);
        this.weight=weight;
    }
    Dog(String name,String color, String breed, int age){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
    }

}
