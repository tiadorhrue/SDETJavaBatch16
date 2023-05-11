package class14;

public class E1Methods {
    void printWord(String word){
        System.out.println(word);
    }

    /*
    void => return type of the method / void means this method doesn't return anything
    printWord => it's the name of the method
    (String word) => parameters / input
    {System.out.println(word);} => body of the method you can write if else conditions loop
     */





    public static void main(String[] args) {
        // we are creating an object of the E1Methods class
        // in java all the classes can be treated as data types
        // new E1Methods() => creating the object of the E1Methods class

        E1Methods obj=new E1Methods();
        // we are calling the printWord() method an obj and passing "java" as argument or inout
        obj.printWord("Java");
    }
}
