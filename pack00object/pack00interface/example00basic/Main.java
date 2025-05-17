package pack00object.pack00interface.example00basic;

interface Base {
  void f();
}

class Derived implements Base {
  public void f() {
    System.out.println("f invoked");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Derived d = new Derived();

    d.f();
  }
}
