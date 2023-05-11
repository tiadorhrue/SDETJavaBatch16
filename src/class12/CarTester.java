package class12;

public class CarTester {
    public static void main(String[] args) {

        Car actualCar = new Car();

        actualCar.make="Jeep";
        actualCar.model="Wrangler";
        actualCar.year=2023;
        actualCar.color="White";
        actualCar.bodyStyle="Truck";
        actualCar.isAAutomatic=false;

        actualCar.startsCar();
        actualCar.pressHorn();
        actualCar.locksCar();
    }
}
