package pack00solid.example00isp;

// Break down the MFP interface into smaller interfaces.

interface MFP {
  // printer
  // scanner
  // fax
}

interface Printer {
   void print();
};

interface Scanner {
   void scan();
};

interface Fax {
   void sendAndReceive();
};

public class Main {
}