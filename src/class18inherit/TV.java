package class18inherit;

public class TV {

    private int size;
    protected String make; // can be used by child
    String model;

}

class AppleTv extends TV{


}
class TVTester{
    public static void main(String[] args) {
        AppleTv apptv=new AppleTv();
        apptv.make="Apple";


    }
}
