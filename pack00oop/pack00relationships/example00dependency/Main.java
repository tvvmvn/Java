package pack00relationships.example00dependency;

class Gasoline {

  void fill() {
     System.out.println("Gasoline has been filled");
  }
};

class Car {

  public void drive(Gasoline gasoline) {

    gasoline.fill();

    System.out.println("The car is running");
  }
};

public class Main {
  public static void main(String[] args) {
    
    Gasoline gasoline = new Gasoline();

    Car car = new Car();

    car.drive(gasoline);
  }
}

// Output
// The car is running