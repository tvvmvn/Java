package dive.generic;
import java.util.ArrayList;

class _1_GenericList {    

  // return type: ArrayList<T>
  static <T> ArrayList<T> f(T p1, T p2) {

    ArrayList<T> fruits = new ArrayList<T>();

    fruits.add(p1);
    fruits.add(p2);

    return fruits;
  }

  public static void main(String[] args) {
    ArrayList<String> fruits = f("apple", "banana");

    for (String fruit : fruits)
      System.out.println(fruit);
  }
}

// Output
// apple
// banana