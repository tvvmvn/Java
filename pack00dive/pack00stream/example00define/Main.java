package pack00dive.pack00stream.example00define;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    
    Integer[] nums = {10, 20, 30};
    Stream<Integer> numStream = Arrays.stream(nums);
    
    // for (Integer num : nums)
    //   System.out.println(num);
    numStream
      .forEach((num) -> System.out.println(num));
  }
}
