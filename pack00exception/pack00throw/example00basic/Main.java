package pack00exception.pack00throw.example00basic;

public class Main {
  public static void main(String[] args) {
    int age = 14;

    try {
      if (age < 18) {
        throw new RuntimeException("You must be at least 18 years old.");
      }
  
      System.out.println("You are old enough!");

    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}
