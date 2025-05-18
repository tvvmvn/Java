package pack00object.pack00class.pack00inheritance.example00multilevel;

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

class Sedan extends Car {
  // f1()
  // f2()
  void f3() {
    System.out.println("f3 invoked");
  }
}

class Main {
}
