package pack00examples;

// TO: function, conditional,

public class AdultTeller {

  static boolean isAdult(int age) {
    
    if (age < 18) {
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    
    boolean r = isAdult(20);

    System.out.println(r);
  }
}
