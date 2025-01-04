package dive.generic;

class Dog { 
  void sound() { System.out.println("bow wow"); } 
}

class Cat {
  void sound() { System.out.println("meow"); } 
}

class Home<T> {
  T adoptedOne;

  Home(T adoptedOne) {
    this.adoptedOne = adoptedOne;
  }
}

public class _1_Association {
  public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();

    Home<Dog> homeWithDog = new Home<Dog>(dog);
    Home<Cat> homeWithCat = new Home<Cat>(cat);

    homeWithDog.adoptedOne.sound();
    homeWithCat.adoptedOne.sound();
  }
}

// Output
// bow wow
// meow