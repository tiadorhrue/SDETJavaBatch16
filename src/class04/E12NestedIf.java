package class04;

public class E12NestedIf {
// work like a russian doll
    public static void main(String[] args) {

        if(true){ // this has to be true for nesting to out put the code

            if(20>3){ // this also has to be true to get this sout
                System.out.println("Inside the nested if");
            }
        }
    }
}
