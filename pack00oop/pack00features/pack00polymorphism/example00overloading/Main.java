package pack00features.pack00polymorphism.example00overloading;

class MyPrinter {
  
  void println(int n) {
    System.out.print(n);
    System.out.println();
  }

  void println(String s) {
    System.out.print(s);
    System.out.println();
  }
}

public class Main {
  
  public static void main(String[] args) {
    
    MyPrinter printer = new MyPrinter();

    // println has many forms
    printer.println("hello");
    printer.println(2025);
  }
}
