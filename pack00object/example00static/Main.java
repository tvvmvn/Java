package pack00object.example00static;

class Test {
  static void f() {
    System.out.println("f is invoked");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // class itself invokes
    Test.f();
  }
}
