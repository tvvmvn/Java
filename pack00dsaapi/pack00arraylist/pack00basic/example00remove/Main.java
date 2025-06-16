package pack00dsaapi.pack00arraylist.pack00basic.example00remove;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.remove(0);

    System.out.println(cars);
  }
}
