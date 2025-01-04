package dsa;
import java.util.ArrayList;

/*
 * The ArrayList class has a regular array inside it. 
 * When an element is added, it is placed into the array. 
 * If the array is not big enough, a new, larger array is created 
 * to replace the old one and the old one is removed.
 */

public class _1_ArrayList {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars);
  }
}

// Output
// [Volvo, BMW, Ford, Mazda]