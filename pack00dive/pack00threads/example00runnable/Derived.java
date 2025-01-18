package pack00dive.pack00threads.example00runnable;

public class Derived implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
