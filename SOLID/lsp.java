class Rectangle {
  public int width;
  public int height;

  public int getSize() {
    return width * height;
  }
};

// Derived classes must be substitutable for their base class.
// and this is violation
class Square extends Rectangle {
  public int getSize() {
    return width * width;
  }
};
