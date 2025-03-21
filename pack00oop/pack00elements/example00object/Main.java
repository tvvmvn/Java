package pack00elements.example00object;

class Person {
  // Attributes
  String firstName;
  String lastName;
  int age;

  // Operation 
  public String toString() {
    return String.format("Person[firstName='%s', lastName='%s', age='%d']", this.firstName, this.lastName, this.age);
  }
}

class Main {
  public static void main(String[] args) {

    // Instances 
    Person person = new Person();

    person.firstName = "John";
    person.lastName = "Doe";
    person.age = 30;

    System.out.println(person);
  }
}
