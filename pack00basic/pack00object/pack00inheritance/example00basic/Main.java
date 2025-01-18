package pack00basic.pack00object.pack00inheritance.example00basic;

public class Main {
  public static void main(String[] args) {

    Student student = new Student();

    student.firstName = "John";
    student.lastName = "Doe";
    student.age = 30;
    student.grade = 3;

    System.out.println(student.firstName);
    System.out.println(student.lastName);
    System.out.println(student.age);
    System.out.println(student.grade);
  }
}
