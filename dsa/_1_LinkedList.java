package dsa;

import java.util.LinkedList;

public class _1_LinkedList {
  public static void main(String[] args) {

    LinkedList<String> cars = new LinkedList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars);
  }
}

// Output
// [Volvo, BMW, Ford, Mazda]