package class3;

public class E13TypeCasting {

    public static void main(String[] args) {

        byte num=127;
        short num2=num;
        // no issues when you are putting a smaller value into a bigger value
        System.out.println(num2);

        int num3=1111120;
        double num4=num3;
        System.out.println(num4);
        // we can convert as long as you are putting a smaller value into a bigger value

        short number=1200;
        byte number2=(byte)number;
        System.out.println(number2);

    }
}
