package class18inherit;

public class BMW extends CarExtend{
    void offerMPackage(){
        System.out.println("Only BMW offers the M Package");
    }

}
class Honda extends CarExtend{


}
class Audi extends CarExtend{


}
class VehicleTester{
    public static void main(String[] args) {

        BMW bmw=new BMW();
        bmw.carOff();

        Honda honda=new Honda();


    }



}