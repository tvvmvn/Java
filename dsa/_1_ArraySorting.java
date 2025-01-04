package dsa;
import java.util.Arrays;

public class _1_ArraySorting {
  public static void main(String[] args) {

    String[] cars = {"Volvo", "BMW", "Tesla", "Ford" };
    
    // Java has Built-in methods for sorting
    Arrays.sort(cars);
    
    for (String i : cars) {
      System.out.println(i);
    }
  }
}

// Output
// BMW
// Ford
// Tesla
// Volvo