package dsa;

import java.util.HashSet;

public class _1_HashSet {
  public static void main(String[] args) {

    HashSet<String> cars = new HashSet<String>();

    // each element is an unique key.
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");

    System.out.println(cars);
  }
}

// Output
// [Volvo, Mazda, Ford, BMW]