package pack00object.pack00class.example00print;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Person [name: " + this.name + ", age: " + this.age +  "]";
  }
}

public class Main {
  public static void main(String[] args) {
    Person person = new Person("John Doe", 30);

    System.out.println(person);
  }
}
