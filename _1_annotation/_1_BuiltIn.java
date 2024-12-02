package _1_annotation;

class Base {
  void f() {
    System.out.println("f invoked");
  }
}

class Derived extends Base {
  @Override
  // Checks that the method is an override. 
  // Causes a compilation error if the method is not found in one of the parent classes 
  // or implemented interfaces.
  void f() {
    System.out.println("f has been overrided");
  }
}

public class _1_BuiltIn {
  public static void main(String[] args) {

  }
}
