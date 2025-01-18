package pack00dive.pack00threads.example00basic;

public class Derived extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
