package pack00basic.pack00object.pack00inheritance.example00constructor;

public class Student extends Person {
  
  int grade;

  Student(String firstName, String lastName, int age, int grade) {
    super(firstName, lastName, age);
    this.age = age;
  }
}
