package pack00dive.pack00lambda.example00consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(5);
    numbers.add(9);
    numbers.add(8);

    Consumer<Integer> method = (n) -> System.out.println(n);

    numbers.forEach(method);
  }
}
