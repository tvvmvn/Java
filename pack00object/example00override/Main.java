package pack00object.example00override;

interface Animal {
  void sound(); 
}

class Cat implements Animal {
  @Override
  public void sound() {
    System.out.println("meow");
  }
}

public class Main {
  public static void main(String[] args) {
    
  }
}
