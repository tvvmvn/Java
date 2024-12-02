package _1_dive;

import java.util.ArrayList;

public class _1_Generic { 
  public static void main(String[] args) { 
    // when working with Collection objects, such as ArrayList, 
    // where primitive types cannot be used 
    // (the list can only store objects):
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    System.out.println(cars);
  } 
}
