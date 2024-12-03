package dive.generic;
// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test<T> {
  // An object of type T is declared
  T prop;
}

// Driver class to test above
public class _1_Class {
  public static void main(String[] args) {
    // instance of Integer type
    Test<Integer> iObj = new Test<Integer>();
    iObj.prop = 2025;
    
    Test<String> sObj = new Test<String>();
    sObj.prop = "Hello";

    System.out.println(iObj.prop);
    System.out.println(sObj.prop);
  }
}