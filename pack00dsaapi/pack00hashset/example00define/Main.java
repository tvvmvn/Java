package pack00dsaapi.pack00hashset.example00define;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    HashSet<String> cars = new HashSet<String>();

    // set items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    System.out.println(cars);
  }
}