package pack00examples.example00arrayfiltering;

public class Main {
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
