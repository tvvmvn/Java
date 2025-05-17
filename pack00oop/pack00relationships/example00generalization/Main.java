package pack00relationships.example00generalization;

class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }
}

class Student extends Person {
  public int grade = 3;

  public Student(String name, int grade) {
    super(name);
    this.grade = grade;
  }
};

class Professor extends Person {
  public String subject;

  public Professor(String name, String subject) {
    super(name);
    this.subject = subject;
  }
};

public class Main {
  public static void main(String[] args) {

    Person student = new Student("John Doe", 3);
    Person employee = new Professor("Jane Doe", "Physics");
  }
}