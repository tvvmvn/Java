package pack00relationships.pack00association.example00composition;

class Person {
  Head head;
  Body body;
}

class Head {
}

class Body {
}

class Main {
  public static void main(String[] args) {
    
    Head head = new Head();
    Body body = new Body();
    
    Person person = new Person();
    person.head = head;
    person.body = body;
  }
}