package pack00dsaapi.pack00arraylist.pack00methods.example00foreach;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    list.forEach(n -> System.out.println(n));
  }
}
