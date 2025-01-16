package pack00variable;

public class MethodScopeExample {

  // methods
  static void f() {
    int x = 2;
  }

  public static void main(String[] args) {
    
    // not accessible
    // System.out.println(x);
  }
}
