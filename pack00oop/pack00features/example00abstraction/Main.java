package pack00features.example00abstraction;

interface Animal {
  public void sound();
}

class Cat implements Animal {
  public void sound() {
    System.out.println("meow");
  }
}

class Dog implements Animal {
  public void sound() {
    System.out.println("bow wow");
  }
}

public class Main {
  public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();
    
    dog.sound();
    cat.sound();
  }
}

// Output
// bow wow
// meow