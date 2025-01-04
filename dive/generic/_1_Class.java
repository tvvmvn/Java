package dive.generic;

// <> to specify Parameter type
class Test<T> {
  // An object of type T is declared
  T prop;
}

public class _1_Class {
  public static void main(String[] args) {

    // instance of Integer type
    Test<Integer> o1 = new Test<Integer>();
    
    o1.prop = 2025;
    
    System.out.println(o1.prop);

    Test<String> o2 = new Test<String>();
    
    o2.prop = "Hello";

    System.out.println(o2.prop);
  }
}

// Output
// 2025
// Hello