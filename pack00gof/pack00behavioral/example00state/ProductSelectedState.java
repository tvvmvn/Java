package pack00gof.pack00behavioral.example00state;

public class ProductSelectedState implements VendingMachineState {
  
  @Override
  public void handleRequest() {
    System.out.println("Product selected: Processing payment.");
  }
}

