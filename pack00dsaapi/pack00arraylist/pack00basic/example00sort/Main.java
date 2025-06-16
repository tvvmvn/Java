package pack00dsaapi.pack00arraylist.pack00basic.example00sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Collections.sort(cars);  

    System.out.println(cars);
  }
}
