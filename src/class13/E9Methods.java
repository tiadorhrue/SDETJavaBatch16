package class13;

public class E9Methods {

    void printSomething(){

        System.out.println("Java is fun");
        System.out.println("Java is fun");
        System.out.println("Java is fun");
        System.out.println("Java is fun");

    }

    static void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }

    static void printWordManyTimes(String word, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(word);

        }

    }
}
