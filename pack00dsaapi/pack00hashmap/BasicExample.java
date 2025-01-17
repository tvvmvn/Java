package pack00dsaapi.pack00hashmap;

import java.util.HashMap;

public class BasicExample {
  public static void main(String[] args) {

    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // set items
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");

    System.out.println(capitalCities);

    // get items
    System.out.println(capitalCities.get("England"));
  }
}
