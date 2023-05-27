package class21polymorphism;

public class RefresherEnhancedLoop {
    public static void main(String args []) {
        int number=10;
        int [] arr={number,20,30};
        for(int num : arr){
            System.out.println(num);
        }

        String [] names={"Vlad","Tia","Luis"};

        for(String name:names){ // each name will be saved in the name variable and take from the names array
            System.out.println(name.length());
        }
        Dog dog1=new Dog("Lal","Black","Persian");
        Dog [] dogs={dog1,new Dog("Papi","White","German")};
        for(Dog d:dogs){
            d.printInfo();
        }

        Animal [] animals= new Dog[]{(new Dog("shaggy", "black", "German"))};
        for(Animal animal:animals){
            animal.printInfo();
        }
    }

}
