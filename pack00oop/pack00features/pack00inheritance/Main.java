package pack00features.pack00inheritance;

class Person {
  String name;
  int age;
}

class Student extends Person {
  int grade;
}

public class Main {
  public static void main(String[] args) {
    
    Student student = new Student();

    student.name = "John";
    student.age = 21;
    student.grade = 3;

    System.out.println(student);
  } 
}