package pack00dsaapi.pack00arraylist;

import java.util.ArrayList;

public class BasicExample {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    // add items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars);

    // access each item
    System.out.println(cars.get(0));
  }
}
