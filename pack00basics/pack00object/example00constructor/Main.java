package pack00object.example00constructor;

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person("John", "Doe", 30);

    System.out.println(person.firstName);
    System.out.println(person.lastName);
    System.out.println(person.age);
  }
}
