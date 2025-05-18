package pack00solid.example00isp;

// Break down the MFP interface into smaller interfaces.
interface MFP {
  // printer
  // scanner
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
}