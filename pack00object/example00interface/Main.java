package pack00object.example00interface;

interface Animal {
  void sound();
}

class Dog implements Animal {
  public void sound() {
    System.out.println("bow wow");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Dog dog = new Dog();

    dog.sound();
  }
}
