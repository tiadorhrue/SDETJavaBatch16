package class6;

public class E5SwitchStatement {

    public static void main(String[] args) {

        char gender='F';

        switch(gender){
            case 'F':
                System.out.println("Female");
            case 'M':
                System.out.println("Male");
            case 'O':
                System.out.println("Other");
            default:
                System.out.println("Prefer not to answer");
        }


    }  // if you don't do break; after every line it will run everything
}
