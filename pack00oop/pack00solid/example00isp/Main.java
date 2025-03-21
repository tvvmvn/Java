package pack00solid.example00isp;

// Break down the MFP interface into smaller interfaces.
interface MFP {
  // scanner
  // printer
  // fax
}

interface Printer {
  public void print();
};

interface Scanner {
  public void scan();
};

interface Fax {
  public void sendAndReceive();
};

public class Main {
  public static void main(String[] args) {
    System.err.println("isp example");
  }
}