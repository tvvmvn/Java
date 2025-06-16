package pack00exception.example00throws;

class Test {
  void f() throws Exception {
    throw new RuntimeException("exception!");
  }
}

public class Main {
  public static void main(String[] args) {
    Test test = new Test();
    
    try {
      test.f();
    } catch (Exception e) {
      // print this
      System.out.println("Caught in Main: " + e);
    }
  }
}