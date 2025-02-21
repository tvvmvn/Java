package pack00gof.pack00behavioral.example00state;


public class PaymentPendingState implements VendingMachineState {
  
  @Override
  public void handleRequest() {
    System.out.println("Payment pending: Dispensing product.");
  }
}
