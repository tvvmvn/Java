package dive.annotation;

class Base {
  void f() {
    System.out.println("f invoked");
  }
}

class Derived extends Base {

  // Checks that the method is an overriden, and causes a compilation error 
  // if the method is not found in parent classes or interfaces.
  @Override
  void f() {
    System.out.println("f has been overriden");
  }
}

public class _1_BuiltIn {
  public static void main(String[] args) {

    Derived d = new Derived();

    d.f();
  }
}
