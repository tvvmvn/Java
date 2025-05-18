package pack00object.pack00interface.pack00inheritance.example00multiple;

interface Shape {
  void draw(); 
}

interface Color {
  void fill();
}

interface Circle extends Shape, Color {
  // draw()
  // fill()
}

class Main {
}
