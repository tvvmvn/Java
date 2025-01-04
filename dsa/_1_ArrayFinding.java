package dsa;

public class _1_ArrayFinding {
  public static void main(String[] args) {

    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    
    int lowestAge = ages[0];

    for (int age : ages) {
      // when finding lower value that lowerstAge
      if (lowestAge > age) {
        // update 'lowerstAge' 
        lowestAge = age;
      }
    }

    System.out.println("The lowest value: " + lowestAge);
  }
}
