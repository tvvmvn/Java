package pack00object.example00accessmodifier;

class Person {
  
  private int salary;

  // getter
  int getSalary() {
    return this.salary;
  }

  // setter
  void setSalary(int salary) {
    this.salary = salary;
  }
}

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
