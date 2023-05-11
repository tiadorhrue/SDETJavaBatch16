package class17constructor;

public class DogConstructor {
   private String name;
   private String color;
   private String breed;
   private int age;

    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);
    }


    DogConstructor(String dogName,String dogColor, String dogBreed, int dogAge){
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;


    }

    public static void main(String[] args) {

        DogConstructor dog=new DogConstructor("Astro","Brown","German",5);
        DogConstructor dog2=new DogConstructor("Saph","Grey","Poodle",1);
        DogConstructor dog3=new DogConstructor("Mecca","Brown","Poodle",12);
        DogConstructor dog4=new DogConstructor("Santana","White","Havanese",1);
        dog.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();

    }
}
