package oop;

class _1_Methods {
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    _1_Methods myObj = new _1_Methods(); // Create an object of Main
    
    myObj.myPublicMethod(); // Call the public method on the object
  }
}