class Animal {
  public void sound() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal {
  public void sound() {
    System.out.println("bow wow");
  }
}

class Cat extends Animal {
  public void sound() {
    System.out.println("meow");
  }
}

class Pig extends Animal {
  public void sound() {
    System.out.println("wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    // Objects to be treated as instances of their parent class 
    // rather than their actual class.
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal pig = new Pig();
        
    dog.sound();
    cat.sound();
    pig.sound();
  }
}

/*
 * Output
 * 
 * bow wow
 * meow
 * wee wee
 */