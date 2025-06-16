package pack00dsaapi.pack00arraylist.pack00methods.example00aslist;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String arr[] = {"alpha", "beta", "gamma"};

    List<String> list = Arrays.asList(arr);

    list.forEach(item -> System.out.println(item));
  }
}
