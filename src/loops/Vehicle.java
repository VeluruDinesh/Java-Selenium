package loops;

abstract class Vehicles {
    public abstract void startEngine();
}

class Car extends Vehicles {
 
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicles {
    
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}

public class Vehicle { 
    public static void main(String[] args) {
        Vehicles car = new Car();
        Vehicles bike = new Bike();

        car.startEngine();
        bike.startEngine();
    }
}
