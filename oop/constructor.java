// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  
  }

  public static void main(String[] args) {
    Main myObj = new Main(); 
    System.out.println(myObj.x); 
  }
}

// Outputs 5