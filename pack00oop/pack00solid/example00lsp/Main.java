package pack00solid.example00lsp;

// Derived classes must be substitutable for their base class.
// and this is violation

class Rectangle {
  
   int width;
   int height;

   int getSize() {
    return width * height;
  }
};

class Square extends Rectangle {

  // width, height

  @Override
   int getSize() {
    return width * width;
  }
};

public class Main {}
