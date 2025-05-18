package pack00object.pack00abstractclass.pack00inheritance.example00multilevel;

abstract class Shape {
  abstract void draw();
}

abstract class Rectangle extends Shape {
  // draw()
  abstract void getWidth();
}

abstract class Square extends Rectangle {
  // draw()
  // getWidth()
}

public class Main {
}
