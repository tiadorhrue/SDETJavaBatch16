package class17constructor;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);
    }


    public static void main(String[] args) {
         Dog obj=new Dog();

         obj.name="Astro";
         obj.color="Brown";
         obj.breed="German";
         obj.age=5;
         obj.printInfo();

        Dog obj2=new Dog();

        obj2.name="Saphyre";
        obj2.color="Grey";
        obj2.breed="Poodle";
        obj2.age=1;
        obj2.printInfo();

        Dog obj3=new Dog();

        obj3.name="Santana";
        obj3.color="White";
        obj3.breed="Havanese";
        obj3.age=1;
        obj3.printInfo();

        Dog obj4=new Dog();

        obj4.name="Lovely";
        obj4.color="Black";
        obj4.breed="Tea Cup Pug";
        obj4.age=2;
        obj4.printInfo();

        Dog obj5=new Dog();

        obj5.name="Mecca";
        obj5.color="Brown";
        obj5.breed="Cavapoo";
        obj5.age=12;
        obj5.printInfo();



    }
}
