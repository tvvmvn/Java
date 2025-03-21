package pack00method.example00overloading;

public class Main {
  static int add(int x, int y) {
    return x + y;
  }
  
  static double add(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {

    int myNum1 = add(1, 2);
    double myNum2 = add(1.2, 1.25);

    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
