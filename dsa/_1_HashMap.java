package dsa;

import java.util.HashMap;

public class _1_HashMap {
  public static void main(String[] args) {

    HashMap<String, Integer> people = new HashMap<String, Integer>();

    // Add a keys/value pair(name, age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    // display
    System.out.println(people);
  }
}

// Output
// {Angie=33, Steve=30, John=32}