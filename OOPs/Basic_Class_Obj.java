class Animal {

    // attributes / properties / Data Members

    String color;
    String name;
    String breed;
    int age;

    // methods
    void eat(){
        System.out.println(name + " is eating");
    }

    void run(){
        System.out.println(name + " is running");
    }
}

public class Basic_Class_Obj {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal dog1 = new Animal();

        Animal lion = new Animal();

        dog.name = "Jainy";
        dog.age = 12;
        dog.breed = "Labra";
        dog.color = "Golden";

        dog1.name = "Tommy";
        dog1.age = 8;
        dog1.breed = "German";
        dog1.color = "Brown ";


        lion.name = "Sher";
        lion.age = 22;

        System.out.println(dog1.age);

        lion.run();
    }
}
