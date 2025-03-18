package pack00dsaapi.pack00iterator.example00basic;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    Iterator<String> it = cars.iterator();

    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
  }
}
