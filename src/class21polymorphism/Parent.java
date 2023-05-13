package class21polymorphism;

public class Parent {

    final int nuOfMonthsInYear=12; // things that are always constant
    final void getMarry(){ // you cannot override final methods
        // nuOfMonthsInYear=13; you will get an error
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    final int nuOfHoursInDay=24;
    @Override
    void study(){
        System.out.println("I will study SDET");
    }
}
