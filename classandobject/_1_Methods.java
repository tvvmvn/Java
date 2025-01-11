package classandobject;

class Person {
  String firstName;
  String lastName;
  int age;

  void introduce() {
    System.out.println("Hello, My name is " + firstName);
  }
}

public class _1_Methods {
  public static void main(String[] args) {

    // create an instance
    Person person = new Person();

    // invoke method
    person.introduce();
  }
}
