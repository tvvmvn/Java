// fat interface
interface MFP {
  public void print();
  public void scan();
  public void fax();
};

// Break down the MFP interface into smaller interfaces.
interface Printer {
  public void print();
};

interface Scanner {
  public void scan();
};

interface Fax {
  public void fax();
};