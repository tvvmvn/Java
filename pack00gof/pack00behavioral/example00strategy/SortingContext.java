package pack00gof.pack00behavioral.example00strategy;

// SortingContext
public class SortingContext {
  
  private SortingStrategy sortingStrategy;
 
  public SortingContext(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }
 
  public void setSortingStrategy(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }
 
  public void performSort(int[] array) {
    sortingStrategy.sort(array);
  }
}