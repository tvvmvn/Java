package _1_basic;

class Dog {
  void sound() {
    System.out.println("bow wow");
  }
}

public class _1_NPE {
  static Dog f() {
    return null;
  }
  
  public static void main(String[] args) {
    Dog dog = f();
    
    dog.sound();
  }
}