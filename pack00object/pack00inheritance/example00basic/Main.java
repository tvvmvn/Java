package pack00object.pack00inheritance.example00basic;

class Person {
  String name;
  
  void greeting() {
    System.out.println("hello");
  }
}

class Student extends Person {
  int grade;
}

class Professor extends Person {
  String subject;
}

public class Main {
  public static void main(String[] args) {
    
    Student student = new Student();
    student.name = "John Doe";
    student.grade = 4;

    System.out.println(student.name + " " + student.grade);
    student.greeting();
  }
}
