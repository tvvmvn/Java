package pack00basic.pack00error;

public class HandlingExample {
  public static void main(String[] args) {
    
    try {
      int nums[] = {10, 20, 30};

      System.out.println(nums[3]);
      
    } catch (Exception e) {
      System.out.println("Something went wrong.");

    }
  }
}
