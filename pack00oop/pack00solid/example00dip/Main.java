package pack00solid.example00dip;

interface Toy {
  void provide();
}

class Lego implements Toy {
  public void provide() {
    System.out.println("Colorful blocks");
  };
};

class Dinosaur implements Toy {
  public void provide() {
    System.out.println("Awesome dinosaur figure");
  }
}

class Kids {
  // depends on toy interface, not on a concreate toy
  public void play(Toy toy) {
    toy.provide();
  }
};

public class Main {
  public static void main(String[] args) {
    
    Toy lego = new Lego();
    Toy dinosaur = new Dinosaur();
    
    Kids kids = new Kids();
    kids.play(lego);
    kids.play(dinosaur);
  }
}
