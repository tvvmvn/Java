package pack00basic.pack00conditionalstatements;

public class ElseIfExample {
  public static void main(String[] args) {
    
    int age = 20;

    if (age < 18) {
      System.out.println("Kids");
    } else if (age >= 18 && age < 40) {
      System.out.println("2030");
    } else {
      System.err.println("Old");
    }
  }
}
