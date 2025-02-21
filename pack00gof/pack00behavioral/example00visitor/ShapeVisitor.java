package pack00gof.pack00behavioral.example00visitor;

// Visitor interface
public interface ShapeVisitor {
  void visit(Circle circle);
  void visit(Square square);
};
