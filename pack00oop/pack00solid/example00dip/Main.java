package pack00solid.example00dip;

interface Toy {
  public void use();
}

class Lego implements Toy {
  
  public void use() {
    System.out.println("Assembling with colorful blocks");
  };
};

class Kids {

  // depends on toy interface, not on a concreate toy
  public void play(Toy toy) {
    toy.use();
  }
};

public class Main {
  public static void main(String[] args) {

    Toy lego = new Lego();
    Kids k = new Kids();
  
    k.play(lego);
  }
}
