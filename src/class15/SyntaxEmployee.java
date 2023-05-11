package class15;

public class SyntaxEmployee {
    int empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {

        SyntaxEmployee obj=new SyntaxEmployee();
       obj.empID=194983505;
       obj.salary=90000;
        System.out.println(obj.empID);
        System.out.println(obj.salary);
        System.out.println(obj.CEO);


    }

}
