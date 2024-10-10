package Abstraction;

abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{
    void startEngine() {
        System.out.println("Car start");
    }
    void stopEngine() {
        System.out.println("Car Stop");
    }
}

class Motorcycle  extends Vehicle{
    void startEngine() {
        System.out.println("Motorcycle  start");
    }
    void stopEngine() {
        System.out.println("Motorcycle  Stop");
    }
}


public class Qes6 {
    public static void main(String[] args) {
  Vehicle obj1=new Car();
  Vehicle obj2=new Motorcycle();
  obj1.startEngine();
  obj1.stopEngine();
  obj2.startEngine();
  obj2.stopEngine();
    }
}
