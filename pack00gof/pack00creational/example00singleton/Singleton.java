package pack00creational.example00singleton;

public class Singleton {
  // static attribute
  private static Singleton instance;
  
  private Singleton() {
    System.out.println("Singleton is Instantiated.");
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    
    return instance;
  }

  public static void doSomething() {
    System.out.println("Somethong is Done.");
  }
}