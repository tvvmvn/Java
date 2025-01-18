package pack00dive.pack00threads.example00runnable;

public class Main {
  public static void main(String[] args) {
    
    Thread thread = new Thread(new Derived());

    thread.start();

    System.out.println("This code is outside of the thread");
  }
}
