package pack00object.pack00inheritance.example00constructor;

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

class Student extends Person {
  
  int grade;

  Student(String firstName, String lastName, int age, int grade) {
    super(firstName, lastName, age);
    this.age = age;
  }
}

public class Main {
  public static void main(String[] args) {

    Student student = new Student("John", "Doe", 21, 3);

    System.out.println(student.firstName);
    System.out.println(student.lastName);
    System.out.println(student.age);
    System.out.println(student.grade);
  }
}
