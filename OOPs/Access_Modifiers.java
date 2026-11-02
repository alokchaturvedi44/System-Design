class Car{
    String model;
    String make;
    String color;
    public int price;

    private String chasiNumber = "123ABC";

    public void start(){
        System.out.println("Car is starting...");
    }

    public void printCNo(){     // since it is public so private members can be accessed from outside via this method if this method is using the private data members, like chasiNumber here, and via this method one can also update the value of private data member too
        // chasiNumber = num;
        System.out.println(chasiNumber);
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Car kia = new Car();

        kia.price = 100000;

        System.out.println(kia.price);
        kia.start();

        // kia.chasiNumber = "343434";  -->> we can not access a private data member outside of the class 

        kia.printCNo();   // since printCNo is public and it is within the class, so it can access the private data members too, hence via this method we are getting the chasiNumber
    }
}
