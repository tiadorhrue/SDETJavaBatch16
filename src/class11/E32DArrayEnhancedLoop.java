package class11;

public class E32DArrayEnhancedLoop {

    public static void main(String[] args) {
        String [][] names2DArray={
                {"Sarah","Artem","Lean","Semir"},
                {"Farwa","Halima","Alina","Tiadorh"}
        };

        for(String[] name1DArr:names2DArray){
            for (String name:name1DArr)
            {
                System.out.println(name);
            }
        }

    }
}
