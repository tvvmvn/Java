package pack00relationships.example00aggregation;

class Printer {
  public String model;

  public Printer(String model) {
    this.model = model;
  }

  public String toString() {
    return String.format("Printer[model='%s']", model);
  }
};

class ComputerA {
  public Printer printer;

  public ComputerA(Printer printer) {
    this.printer = printer;
  }
};

class ComputerB {
  public Printer printer;

  public ComputerB(Printer printer) {
    this.printer = printer;
  }
};

/*
In the UML, aggregation and composition are defined as 
special forms of associations with the intended meaning 
of classifying part-whole-relationships.
*/

public class Main {
  public static void main(String[] args) {
    
    Printer printer = new Printer("HP p-100");
    
    ComputerA A = new ComputerA(printer);
    ComputerB B = new ComputerB(printer);
  }
}

// Output
// [model='P-115']