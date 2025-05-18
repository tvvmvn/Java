package pack00object.pack00abstractclass.example00implementation;

abstract class Shape {
  abstract void draw();
}

// implementation of Shape
class Rectangle extends Shape {
  void draw() { 
    System.out.println("draw a rectangle");
  }
}

public class Main {
}
