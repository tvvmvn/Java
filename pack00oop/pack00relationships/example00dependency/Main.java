package pack00relationships.example00dependency;

class Security {
  void accessControl(Role role) {
    if (role.name == "admin") {
      System.out.println("accesssible to Top secret");
    } else {
      System.out.println("accessible to public data");
    }
  }
}

class Role {
  String name;
  
  Role(String name) {
    this.name = name;
  }
}

class Main {
  public static void main(String[] args) {
    
    Role role = new Role("admin");
    Security security = new Security();

    security.accessControl(role);
  }
}