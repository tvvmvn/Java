package dive;

class Outer {
  int o = 10;

  class Inner {
    int i = 5;
  }
}

public class _1_InnerClass {
  public static void main(String[] args) {

    Outer outer = new Outer();

    Outer.Inner inner = outer.new Inner();
    
    System.out.println(outer.o);
    System.out.println(inner.i);
  }
}

// Output
// 10
// 5