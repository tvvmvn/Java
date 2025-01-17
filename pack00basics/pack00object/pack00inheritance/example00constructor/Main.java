package pack00object.pack00inheritance.example00constructor;

public class Main {
  public static void main(String[] args) {

    Student student = new Student("John", "Doe", 21, 3);

    System.out.println(student.firstName);
    System.out.println(student.lastName);
    System.out.println(student.age);
    System.out.println(student.grade);
  }
}
