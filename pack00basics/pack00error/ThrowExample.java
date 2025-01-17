package pack00error;

public class ThrowExample {
  public static void main(String[] args) {

    int age = 14;

    try {
      if (age < 18) {
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
      }
  
      System.out.println("Access granted - You are old enough!");

    } catch (Exception e) {
      System.out.println("Access denied - Kids!");
    }

  }
}
