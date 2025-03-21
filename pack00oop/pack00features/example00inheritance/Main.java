package pack00features.example00inheritance;

class Person {
  String firstName;
  String lastName;
  int age;

  public String toString() {
    return String.format("Person[firstName='%s', lastName='%s', age='%d']", this.firstName, this.lastName, this.age);
  }
}

class Student extends Person {
  int grade;

  @Override
  public String toString() {
    return String.format("Person[firstName='%s', lastName='%s', age='%d', grade='%d']", this.firstName, this.lastName, this.age, this.grade);
  }
}

public class Main {
  public static void main(String[] args) {
    
    Student student = new Student();

    student.firstName = "John";
    student.lastName = "Doe";
    student.age = 21;
    student.grade = 3;

    System.out.println(student);
  } 
}