package pack00basic.pack00array.example00basic;

public class Main {
  public static void main(String[] args) {
    
    int nums[] = {10, 20, 30};

    // access first item
    System.err.println("First item: " + nums[0]);

    // change first item
    nums[0] = 11;

    System.out.println("After updating first item to 11: " + nums[0]);

    // get length 
    System.err.println("Length: " + nums.length);
  }
}
