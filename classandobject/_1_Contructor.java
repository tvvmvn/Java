package classandobject;

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

public class _1_Contructor {
  public static void main(String[] args) {

    // create an instance with constructor
    Person person = new Person("John", "Doe", 30);
  }
}
