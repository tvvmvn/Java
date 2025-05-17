package pack00relationships.pack00association.example00aggregation;

class Phone {
  Printer printer;
}

class PC {
  Printer printer;
  Keyboard keyboard;
}

class Printer {
}

class Keyboard {
}

public class Main {
  public static void main(String[] args) {
    
    Printer printer = new Printer();
    Keyboard keyboard = new Keyboard();
    
    Phone phone = new Phone();
    phone.printer = printer;
    
    PC pc = new PC();
    pc.printer = printer;
    pc.keyboard = keyboard;
  }
}
