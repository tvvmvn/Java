package pack00method.example00return;

public class Main {

  static int add(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {

    int r = add(1, 2);

    System.out.printf("1 + 2 = %d\n", r);
  }
}
