interface Toy {
  public void use();
}

class Lego implements Toy {
  public void use() {
    System.out.println("with Lego");
  }
}

class Kids {
  void play(Toy toy) {
    toy.use();
  }
}

public class Main {
  public static void main(String[] args) {
    // Lego lego = new Lego() // ok
    Toy lego = new Lego();
    Kids k = new Kids();
    k.play(lego);
  }
}