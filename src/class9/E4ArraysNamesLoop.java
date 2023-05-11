package class9;

public class E4ArraysNamesLoop {
    public static void main(String[] args) {

        String[] names={"Tia","Luis","Ariela","Jasmine","Valeria"};
        for (int i=0;i<names.length-1;i++){
            System.out.println(names[i]);


    }

        int counter=0;
        while(counter<names.length)
        {
            System.out.print(names[counter]+" ");
            counter++;
        }

    }

}
