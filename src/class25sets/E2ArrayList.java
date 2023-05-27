package class25sets;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {

        Headset headset1=new Headset("Razer Nari Ultimate",79.99,4620);
        Headset headset2=new Headset("NEW StealSeries Arctis",52.64,4868);
        Headset headset3=new Headset("HyperX Cloud II",0,32116);

        System.out.println(headset1.toString()); // toString is default and is called behind the scenes

        System.out.println();

        List<Headset> headsetsList=new ArrayList<>();
        headsetsList.add(headset1);
        headsetsList.add(headset2);
        headsetsList.add(headset3);

        printList(headsetsList);



        System.out.println();

        for(Headset h: headsetsList){
            h.printInfo();
        }

    }
    public static void printList(List<Headset>headsetsList){
        for(Headset h: headsetsList){
            h.printInfo();
        }
    }


}
class Headset{
    private String title;
    private double price;
    private int noOfReviews;

    Headset(String title, double price, int noOfReviews){
        this.title=title;
        this.price=price;
        this.noOfReviews=noOfReviews;
    }

    void printInfo(){
        System.out.println(title+" "+price+" "+noOfReviews);
    }

    public String toString(){
        return title+" "+price+" "+noOfReviews;
    }
}
