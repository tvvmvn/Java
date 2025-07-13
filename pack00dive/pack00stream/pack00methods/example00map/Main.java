package pack00dive.pack00stream.pack00methods.example00map;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    
    Integer[] nums = {10, 20, 30};
    Stream<Integer> numStream = Arrays.stream(nums);
    
    // for (Integer num : nums)
    //   System.out.println(num);
    Stream<Integer> list = numStream
        .map(item -> item * 10);

    list.forEach((num) -> System.out.println(num));
  }
}
