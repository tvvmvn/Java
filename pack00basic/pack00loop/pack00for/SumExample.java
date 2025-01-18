package pack00basic.pack00loop.pack00for;

public class SumExample {
  public static void main(String[] args) {
    
    int sum = 0;

    for (int i = 1; i <= 10; i++ ) {
      sum += i;
    }

    System.out.println("1 + 2 + .. + 10 = " + sum);
  }
}
