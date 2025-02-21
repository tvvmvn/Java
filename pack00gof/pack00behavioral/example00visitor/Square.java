package pack00gof.pack00behavioral.example00visitor;

// Concrete Element
public class Square implements Shape {
  
  @Override
  public void accept(ShapeVisitor visitor) {
    visitor.visit(this);
  }
};
 
