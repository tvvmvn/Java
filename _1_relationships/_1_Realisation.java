package _1_relationships;

// Abstract class or interface(Java)
interface Flyable {
  public void fly();
};

// implementation
class Plane implements Flyable {
  public void fly() {
    System.out.println("It can fly with technology");
  }
};

// implementation
class Bird implements Flyable {
  public void fly() {
    System.out.println("It can fly with wings");
  }
};

class _1_Realisation {}