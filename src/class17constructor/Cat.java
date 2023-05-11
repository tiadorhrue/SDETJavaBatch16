package class17constructor;

public class Cat {

    String name;
    Cat(String catName){
        name=catName;
        System.out.println("1 argument called");
    }
    Cat(String name,String color){
        System.out.println("2 argument constructor called");
    }
    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(double weight){
        System.out.println("double argument constructor");
    }
    Cat(){
        System.out.println("argument consrustor called");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Mixie");


    }
}
