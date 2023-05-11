package class18inherit;

class Furniture {

    String color="Black";
}
class Chair extends Furniture{
    String color="White";

    void printColor(){
        String color="Blue"; // Local is always preferred
        System.out.println(color); // Prints "Blue" from local variable
    }
    void printColor2(){
        String color="Red";
        System.out.println(this.color); // Prints "White" from Chair class instance variable
        System.out.println(super.color); // Prints "Black" from parent class
    }

class FurnitureTester{
    public static void main(String[] args) {

        Chair chair=new Chair();
        chair.printColor();
        chair.printColor2();

    }

}
}

