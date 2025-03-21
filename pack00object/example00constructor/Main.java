package pack00object.example00constructor;

class Person {
  String firstName;
  String lastName;
  int age;

  Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person("John", "Doe", 30);

    System.out.println(person.firstName);
    System.out.println(person.lastName);
    System.out.println(person.age);
  }
}
