package pack00features.example00abstraction;

interface Vehicle {
  public void run(); // abstract 
}

class Car implements Vehicle {
  public void run() {
    System.out.println("run by engine");
  }
}

class Bicycle implements Vehicle {
  public void run() {
    System.out.println("run by legs");
  }
}

public class Main {
  public static void main(String[] args) {

    Bicycle bicycle = new Bicycle();
    Car car = new Car();
    
    car.run();
    bicycle.run();
  }
}

// Output
// bow wow
// meow