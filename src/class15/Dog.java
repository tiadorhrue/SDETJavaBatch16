package class15;

public class Dog {
    String name;
    String color;
    int age;
    static double weight;

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.weight=20;
        dog.color="green";



        int [] arry={10,20,30,40};
        for (int i = 0; i < arry.length; i++) {

        }

        String job="love";



        Dog dog1=new Dog();
        System.out.println(dog1.weight);
        System.out.println(dog1.color); // you won't see any output because green value for the local variable is in "dog" object
    }
}
