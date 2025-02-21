package pack00gof.pack00behavioral.example00command;

// Invoker
public class RemoteControl {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }
}
