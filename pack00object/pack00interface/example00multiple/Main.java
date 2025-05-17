package pack00object.pack00interface.example00multiple;

interface Base1 {
  void f1(); 
}

interface Base2 {
  void f2();
}

class Derived implements Base1, Base2 {
  public void f1() {
    System.out.println("f1 invoked");
  }
  public void f2() {
    System.out.println("f2 invoked");
  }
}

class Main {
  public static void main(String[] args) {
    Derived d = new Derived();

    d.f1();
    d.f2();
  }
}
