package pack00dsaapi.pack00hashmap.example00define;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Map<String, Object> person = new HashMap<String, Object>();
    person.put("name", "John Doe");
    person.put("age", 30);
    person.put("isGoodGuy", true);
    
    System.out.println(person.get("name"));
    System.out.println(person.get("age"));
    System.out.println(person.get("isGoodGuy"));
  }
}
