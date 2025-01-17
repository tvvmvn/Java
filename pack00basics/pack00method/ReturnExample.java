package pack00method;

public class ReturnExample {

  static int add(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {

    int r = add(1, 2);

    System.out.printf("1 + 2 = %d\n", r);
  }
}
