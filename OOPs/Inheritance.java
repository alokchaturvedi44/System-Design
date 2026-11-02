class Animal{
    String name;
    String breed;

    public void walk(){
        System.out.println(name + " is walking");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    protected void canThink(){
        System.out.println(name + " can not think");
    }
}

// Single-Level Inheritance

class Dog extends Animal{       // inheritance: using extend keyword, now Dog class have all the features of Animal class
    public void pet(){
        System.out.println(name + " is now a pet");
    }

    // Method Overriding
    @Override 
    public void walk(){
        System.out.println("method overriding...");
    }
}

class Lion extends Animal{

    Lion(){
        name = "Gabbar";
    }
    public void hunts(){
        System.out.println(name + " is hunting");
    }

    protected void canThink(){
        System.out.println(name + " can think");
    }
}

// Multi-Level Inheritance

class GermanShepherdd extends Dog{

    public void canSecure(){
        System.out.println(breed + " can provide security");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog labra = new Dog();
        labra.name = "Jainy";

        System.out.println(labra.name);
        labra.eat();
        labra.pet();

        System.out.println("-------------------");
        
        Lion sher = new Lion();
        sher.breed = "Babbar Sher";

        System.out.println(sher.breed);
        sher.walk();
        sher.hunts();

        System.out.println("-------------------");

        GermanShepherdd gs = new GermanShepherdd();
        gs.name = "Bruno";
        gs.breed = "German Shepherd";

        System.out.println(gs.name);
        gs.pet();
        gs.canSecure();

    }
}
