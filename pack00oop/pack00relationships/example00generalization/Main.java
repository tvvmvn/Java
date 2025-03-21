package pack00relationships.example00generalization;

class Person {
  String firstName;
  String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}

class Student extends Person {

  public int grade = 3;

  public Student(String firstName, String lastName, int grade) {
    super(firstName, lastName);
    this.grade = grade;
  }
};

class Employee extends Person {

  public String dept;

  public Employee(String firstName, String lastName, String dept) {
    super(firstName, lastName);
    this.dept = dept;
  }
};

public class Main {
  public static void main(String[] args) {

    // Generalisation 
    Person student = new Student("John", "Doe", 3);
    Person employee = new Employee("Jane", "Doe", "Marketing");
  }
}

// Output
// Americano[beans='Columbia', water='2l']
// Americano[beans='Columbia', water='2l', milk='Milk']