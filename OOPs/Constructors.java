class Animal {
    String color;
    String name;
    String breed;
    int age;

    Animal(){   // default constructor -> not necessary to write java automatically add this. It is triggered when an Object is created
        System.out.println("Default Constructor");
        color = "White";
    }

    Animal(String animalName, int animalAge){   // Parameterized constructor
        name = animalName;
        age = animalAge;
    }

    // methods
    void eat(){
        System.out.println(name + " is eating");
    }

    void run(){
        System.out.println(name + " is running");
    }
}
public class Constructors {
    public static void main(String[] args) {
        Animal dog = new Animal();

        // required if we are not using any parameterized constructor
        dog.name = "Jainy";
        dog.age = 12;
        dog.breed = "Labra";

        System.out.println(dog.name);

        System.out.println(dog.color);      // since dog color is not defined, but we have added a default color in out Animal constructor, it will be assigned automatically


        // creating an object with parameterized constructor
        Animal cat = new Animal("Meowie", 7);
        System.out.println(cat.name);
    }
}
