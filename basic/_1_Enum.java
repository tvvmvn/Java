package basic;

enum Level {
  LOW,
  MEDIUM,
  HIGH
}

class _1_Enum {
  public static void main(String[] args) {

    Level lev = Level.MEDIUM;

    switch(lev) {
      case LOW:
        System.out.println("Low level");
        break;

      case MEDIUM:
         System.out.println("Medium level");
        break;
        
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}

// Output
// Medium level