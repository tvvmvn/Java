package pack00conditionalstatements;

public class SwitchExample {
  public static void main(String[] args) {
    int day = 4;

    switch (day) {
      
      case 6:
        System.out.println("Today is Saturday");
        break;

      case 7:
        System.out.println("Today is Sunday");
        break;

      // optional, when all case is false
      default:
      System.out.println("Looking forward to the Weekend");
    }
  }
}
