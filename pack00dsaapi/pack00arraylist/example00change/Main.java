package pack00dsaapi.pack00arraylist.example00change;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.set(0, "Avante");

    System.out.println(cars);
  }
}
