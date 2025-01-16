package pack00variable;

public class BlockScopeExample {
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
