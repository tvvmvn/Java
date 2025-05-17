package pack00object.pack00inheritance.example00multilevel;

class Vehicle {
  void f1() {
    System.out.println("f1 invoked");
  }; 
}

class Car extends Vehicle {
  void f2() {
    System.out.println("f2 invoked");
  };
}

class Sedan extends Car {}

class Main {
  public static void main(String[] args) {
    Sedan sedan = new Sedan();

    sedan.f1();
    sedan.f2();
  }
}
