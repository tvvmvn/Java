package pack00dsaapi.pack00arraylist.pack00methods.example00sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    List<String> cars = new ArrayList<String>();
    cars.add("Sonata");
    cars.add("Avante");
    cars.add("Grandeur");

    Collections.sort(cars);

    System.out.println(cars);
    // Avante, Grandeur, Sonata
  }
}
