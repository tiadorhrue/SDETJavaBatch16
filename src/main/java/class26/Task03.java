package class26;

import java.util.HashMap;

public class Task03 {
    public static void main(String[] args) {
        HashMap<Integer,String> product= new HashMap<>();
        product.put(784783,"Printer");
        product.put(784784,"TV");
        product.put(784785,"Laptop");
        product.put(784786,"Digital Camera");
        product.put(784787,"Drome");

        System.out.println(product.entrySet());

        System.out.println("*****************");

        for (var p: product.entrySet()) {
            System.out.println(p);
        }

    }
}
