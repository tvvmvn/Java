package classandobject;

class Person {
  private int age;

  // getter and setter
  void setAge(int age) {
    this.age = age;
  }

  int getAge() {
    return this.age;
  }
}

public class _1_AccessModifier {
  public static void main(String[] args) {

    Person person = new Person();

    person.setAge(30);

    System.out.println(person.getAge());
  }
}
