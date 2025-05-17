package pack00object.pack00inheritance.example00constructor;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Student extends Person {
  int grade;

  Student(String name, int age, int grade) {
    super(name, age);
    this.age = age;
  }
}

public class Main {
  public static void main(String[] args) {

    Student student = new Student("John Doe", 21, 3);

    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println(student.grade);
  }
}
