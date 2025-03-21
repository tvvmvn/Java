package pack00method.example00args;

public class Main {

  static void add(int x, int y) {
    System.out.printf("%d + %d = %d\n", x, y, x + y);

  }

  public static void main(String[] args) {

    add(1, 2);
    add(2, 3);
  }
}
