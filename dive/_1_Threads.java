package dive;

class RunnableImpl implements Runnable {
  
  // run()
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

public class _1_Threads {

  public static void main(String[] args) {

    RunnableImpl task = new RunnableImpl();

    Thread thread = new Thread(task);
    
    // Start a thread
    thread.start();
    
    // Normal codes 
    System.out.println("This code is outside of the thread");
  }
}

// Output
// This code is outside of the thread
// This code is running in a thread