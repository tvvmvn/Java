package dive.generic;

public class _1_Methods {    
  // focus on return type: Optional<T>
  static <T> void print(T param) {
    System.out.println(param);
  }
  
  public static void main(String[] args) {
    print("Hello");
    print(2025);
  }
}