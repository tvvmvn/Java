package pack00dsaapi.pack00hashmap.example00access;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");

    System.out.println(capitalCities.get("England"));
  }
}
