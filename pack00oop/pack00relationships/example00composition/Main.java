package pack00relationships.example00composition;

/*
In the UML, aggregation and composition are defined as 
special forms of associations with the intended meaning 
of classifying part-whole-relationships.
*/

// Exclusive (non-shareable) parts.
class AvanteEngine {
}

class Avante {
  
  public AvanteEngine engine;

  Avante(AvanteEngine engine) {
    this.engine = engine;
  }
}


public class Main {
  public static void main(String[] args) {
    
    AvanteEngine engine = new AvanteEngine();

    Avante avante = new Avante(engine);
  }
}