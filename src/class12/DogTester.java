package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();

        actualDog.name="Astro";
        actualDog.age=15;
        actualDog.breed="German Shepherd";
        actualDog.color="Black";
        actualDog.weight=50;


        actualDog.bark();

        Dog actDog=new Dog();

        actDog.name="Saphye";
        actDog.age=2;
        actDog.breed="Poodle";
        actDog.color="Grey and Black";
        actDog.weight=12;


    }
}
