package _1_generic;

class Dog { 
  void sound() { System.out.println("bow wow"); } 
}

class Cat {
  void sound() { System.out.println("meow"); } 
}

class Home<T> {
  T adopted;

  Home(T adopted) {
    this.adopted = adopted;
  }
}

// Driver
public class _1_Association {
  public static void main(String[] args) {
    Home<Dog> homeWithDog = new Home<Dog>(new Dog());
    Home<Cat> homeWithCat = new Home<Cat>(new Cat());

    homeWithDog.adopted.sound();
    homeWithCat.adopted.sound();
  }
}