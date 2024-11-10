public class Main {
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of Main
    
    myObj.myPublicMethod(); // Call the public method on the object
  }
}