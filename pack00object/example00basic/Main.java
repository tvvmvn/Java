package pack00object.example00basic;

class Person {
  String firstName;
  String lastName;
  int age;

  // methods
  public void display() {
    System.out.println(this.firstName);
    System.out.println(this.lastName);
    System.out.println(this.age);
  }
}

public class Main {
  public static void main(String[] args) {

    Person person = new Person();

    person.firstName = "John";
    person.lastName = "Doe";
    person.age = 30;

    person.display();
  }
}
