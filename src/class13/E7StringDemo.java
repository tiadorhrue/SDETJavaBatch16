package class13;

public class E7StringDemo {
    public static void main(String[] args) {

        String nsmr="Marina";
        String name1="Abdul";
        String name2="Brett";
        String countrry="USA"; // This way saves memory
        String country1="USA"; // Slower
        String country2="USA";

        StringBuilder country4=new StringBuilder("USA"); // Better when you want to make changes
        StringBuilder country5=new StringBuilder("USA"); // makes a new variable, so it can waste alot of space
        StringBuilder country6=new StringBuilder("USA");
    }
}
