package pack00elements.example00message;

class Calculator {
  int add(int x, int y) {
    return x + y;
  }
}

class Main {
  public static void main(String[] args) {

    Calculator cal = new Calculator();

    // messages (request to object from outside)
    int r = cal.add(1, 2);

    System.out.println("1 + 2 = ");
    System.out.println(r);
  }
}

// Output
// x + y = 2