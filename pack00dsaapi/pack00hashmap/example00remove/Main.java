package pack00dsaapi.pack00hashmap.example00remove;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // set items
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");

    capitalCities.remove("England");

    System.out.println(capitalCities);
  }
}
