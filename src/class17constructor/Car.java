package class17constructor;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;

    Car(String make, String model, int engineCC,String color){
        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
        System.out.println(make+" "+model+" "+engineCC+" "+color);

    }
    void printInfo()
    {
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","Civic",1800,"White");
        car.printInfo();
    }
}
