package pack00variable.pack00scope.example00block;

public class Main {
  public static void main(String[] args) {
    
    {
      int x = 2;

      // accessible
      System.out.println(x);
    }

    // not accessible.
    // System.out.println(x);
  }
}
