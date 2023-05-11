package class16;

public class Person {

    // you can only have one public class in one file
    String SSN="12345678"; // you don't have to write out "default" because it is the default keyword //
    // it can be used within the same package

    private String password;

    private static double bankBalance=12000;

    public void printpassword(){
        System.out.println(password);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printpassword();
        System.out.println(Person.bankBalance);


    }

}

