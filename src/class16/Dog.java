package class16;

public class Dog {

    String name;
    String color;
    String breed;

    static int age;
    void bark(){
        System.out.println("woof woof ");
    }

     void printInfo() {
         if (breed.equals("German")) {
             System.out.println(name + " " + color + " I can work for NYPD");
         }
     }
         static void printInfo2() {
             if(age<10)
             {
                 System.out.println("Young Dog");
             }else
             {
                 System.out.println("Older Dog");
             }

         }


}
