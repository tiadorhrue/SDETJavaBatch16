package class9;

public class E7ArraysBoolean {

    public static void main(String[] args) {

        boolean[] flags={true,false,true,false,false,true};
        int counter=0;

        for (int i = 0; i < flags.length; i++) {
            if(flags[i]==false)
            {counter++;}
        }
        System.out.println(counter);

    }
}
