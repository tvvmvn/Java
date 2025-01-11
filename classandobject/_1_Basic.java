package classandobject;

class Person {
  String firstName;
  String lastName;
  int age;
}

public class _1_Basic {
  public static void main(String[] args) {
    
    // create an instance
    Person person = new Person();

    // assign value to an instance
    person.firstName = "John";
    person.lastName = "Doe";
    person.age = 30;

    // access an instance
    System.out.println(person.firstName);
    System.out.println(person.lastName);
    System.out.println(person.age);
  }
}
