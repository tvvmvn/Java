package dive;

class _1_Threads implements Runnable {
  public static void main(String[] args) {
    _1_Threads obj = new _1_Threads();
    Thread thread = new Thread(obj);
    
    thread.start();
    
    System.out.println("This code is outside of the thread");
  }

  public void run() {
    System.out.println("This code is running in a thread");
  }
}