package pack00object.example00abstract;

abstract class Animal {
  abstract void sound();
  // other functions like abstract or normal here..
}

class Cat extends Animal {
  void sound() {
    System.out.println("meow");
  }
}

class Dog extends Animal {
  // implementation of sound 
  void sound() {
    System.out.println("bow wow!");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Dog dog = new Dog();

    dog.sound();
  }
}
