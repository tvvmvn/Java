package pack00features.example00polymorphism;

class Animal {
  public void sound() {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal {
  public void sound() {
    System.out.println("meow");
  }
}

class Dog extends Animal {
  public void sound() {
    System.out.println("bow wow");
  }
}

class Pig extends Animal {
  public void sound() {
    System.out.println("wee wee");
  }
}

public class Main {
  public static void main(String[] args) {
     
    // Polymorphism?
    // Objects to be treated as instances of their parent class 
    // rather than their actual class.

    Animal dog = new Dog();
    dog.sound();

    Animal cat = new Cat();
    cat.sound();
    
    Animal pig = new Pig();    
    pig.sound();
  }
}


// Output
// bow wow
// meow
// wee wee