package basic;

public class _1_Exception {
  static void checkAge(int age) { 
    
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
    } 

    System.out.println("Access granted - You are old enough!"); 
 } 
 
  public static void main(String[] args) { 
    checkAge(15); 
  } 
}

/*
 *  Output
 Exception in thread "main" java.lang.ArithmeticException: 
 Access denied - You must be at least 18 years old.
        at Main.checkAge(Main.java:4)
        at Main.main(Main.java:12)
 */