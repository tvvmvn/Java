package pack00features.example00encapsulation;

class Person {
  private int salary;
  
  public int getSalary() {
    return this.salary;
  }
  
  public void setSalary(int salary) {
    this.salary = salary;
  }
}

public class Main {
  public static void main(String[] args) {
    
    Person person = new Person();

    // this causes error
    // person.salary = 200;
    // System.out.println(person.salary);

    person.setSalary(200);

    System.out.println(person.getSalary());
  }
}

// Output
// 200