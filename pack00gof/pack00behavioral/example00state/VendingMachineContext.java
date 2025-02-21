package pack00gof.pack00behavioral.example00state;

// Context
public class VendingMachineContext {
  private VendingMachineState state;

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public void request() {
    state.handleRequest();
  }
}

