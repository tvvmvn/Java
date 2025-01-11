package classandobject;

abstract class Animal {
  abstract void f();
}

class Dog extends Animal {
  void f() {
    System.out.println();
  }
}

public class _1_AbstractClass {
  public static void main(String[] args) {
    
    Dog dog = new Dog();

    dog.f();
  }
}
