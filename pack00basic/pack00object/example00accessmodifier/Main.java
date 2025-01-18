package pack00basic.pack00object.example00accessmodifier;

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person();

    // access from outside class
    // person.salary = 200; // error
    // System.out.println(person.salary); // error

    // solution
    person.setSalary(200);

    System.out.println(person.getSalary());
  }
}
