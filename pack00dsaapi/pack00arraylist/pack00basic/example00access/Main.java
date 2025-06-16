package pack00dsaapi.pack00arraylist.pack00basic.example00access;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    // add items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    // access each item
    System.out.println(cars.get(0));
    System.out.println(cars.get(1));
    System.out.println(cars.get(2));
  }
}
