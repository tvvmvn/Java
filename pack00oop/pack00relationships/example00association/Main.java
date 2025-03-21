package pack00relationships.example00association;

class Address {
  public String city;
  public String street;

  public Address(String city, String street) {
    this.city = city;
    this.street = street;
  }

  public String toString() {
    return String.format("Address[city='%s', street='%s']", city, street);
  }
};

class Person {
  public Address address;

  public Person(Address address) {
    this.address = address;
  }
};

public class Main {
  public static void main(String[] args) {

    Address address = new Address("New York", "11st");
    Person john = new Person(address);

    System.out.println(john.address);
  }
}

// Output
// Address[city='Seoul', street='st']