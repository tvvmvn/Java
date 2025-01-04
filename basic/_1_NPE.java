package basic;

class Dog {
  void sound() {
    System.out.println("bow wow");
  }
}

public class _1_NPE {

  static Dog f() {
    return null;
  }
  
  public static void main(String[] args) {

    // dog is null
    Dog dog = f();
    
    dog.sound();
  }
}

// Output
// Exception in thread "main" java.lang.NullPointerException: 
// Cannot invoke "basic.Dog.sound()" because "dog" is null
// at basic._1_NPE.main(_1_NPE.java:19)