package oop;

// Create a Main class
class _1_Constructor {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public _1_Constructor() {
    x = 5;  
  }

  public static void main(String[] args) {
    _1_Constructor myObj = new _1_Constructor(); 
    System.out.println(myObj.x); 
  }
}

// Outputs 5