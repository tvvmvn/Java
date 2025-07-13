package pack00exception.example00define;

public class Main {
  public static void main(String[] args) {
    
    int n = 2 / 0;
    
    /*
     * ex name
     * ex message
     * ex stack
     * 
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     * at pack00exception.example00define.Main.main(Main.java:5)
     */
    System.out.println(n);
  }
}
