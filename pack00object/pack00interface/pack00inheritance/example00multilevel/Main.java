package pack00object.pack00interface.pack00inheritance.example00multilevel;

interface Shape {
  void draw();
}

interface Rectangle extends Shape {
  void getWidth();
}

interface Square extends Rectangle {
  // draw()
  // getWidth()
}

public class Main {
}