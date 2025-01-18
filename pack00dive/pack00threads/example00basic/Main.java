package pack00dive.pack00threads.example00basic;

public class Main {
  public static void main(String[] args) {
    
    Derived thread = new Derived();

    thread.start();

    System.out.println("This code is outside of the thread");
  }
}
