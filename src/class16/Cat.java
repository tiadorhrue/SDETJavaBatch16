package class16;

public class Cat {
    private String name="Maine";
    private String breed;
    private String color;

    public void printInfo(String password){
        if(password.equals("pass123")){
            System.out.println(name);
        }
        else
        {
            System.out.println("You need to provide password to access this info");
        }
    }
}
