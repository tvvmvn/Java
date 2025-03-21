package pack00relationships.example00realization;

interface Flyable {
  public void fly();
};

class Bird implements Flyable {

  public void fly() {
    System.out.println("It can fly with wings");
  }
};

class Plane implements Flyable {

  public void fly() {
    System.out.println("It can fly with technology");
  }
};

public class Main {
  public static void main(String[] args) {
    
    Flyable plane = new Plane();
    plane.fly();
    
    Flyable bird = new Bird();
    bird.fly();
  }
}

// Output
// It can fly with technology
// It can fly with wings