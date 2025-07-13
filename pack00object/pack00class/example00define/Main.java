package pack00object.pack00class.example00define;

class Person {

  String name;
  
  int age;

  void greeting() {
    System.out.println("hello");
  }
}

public class Main {
  public static void main(String[] args) {

    // instance
    Person person = new Person();
    person.name = "John";
    person.age = 30;
  }
}
