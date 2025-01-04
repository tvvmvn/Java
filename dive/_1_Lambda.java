package dive;

import java.util.ArrayList;

public class _1_Lambda {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    
    // Loop through with forEach methods
    numbers.forEach((n) -> { 
      System.out.println(n); 
    });
  }
}

// Output
// 5
// 9
// 8
// 1