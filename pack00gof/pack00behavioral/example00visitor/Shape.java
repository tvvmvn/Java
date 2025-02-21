package pack00gof.pack00behavioral.example00visitor;

// Element interface
public interface Shape {
  void accept(ShapeVisitor visitor);
};
