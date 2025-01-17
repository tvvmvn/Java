package pack00loop.pack00for.pack00arrayloop;

public class FilteringExample {
  public static void main(String[] args) {
    
    int ages[] = {12, 24, 36};

    // filtering
    
    for (int i = 0; i < ages.length; i++) {
      // print adults
      if (ages[i] >= 18) {
        System.out.println(ages[i]);
      }
    }
  }
}
