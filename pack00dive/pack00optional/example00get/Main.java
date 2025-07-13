package pack00dive.pack00optional.example00get;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    
    Optional<String> o = Optional.of("foo");

    // foo
    System.out.println(o.get());
  }
}
