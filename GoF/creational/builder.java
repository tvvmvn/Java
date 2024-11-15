// Builder interface
interface ComputerBuilder {
  public void buildCPU(String cpu);
  public void buildMemory(String memory);
  public void buildStorage(String storage);
  public Computer getResult();
};

// Concrete Builder
class DesktopComputerBuilder implements ComputerBuilder {
  private Computer _computer;
  
  public DesktopComputerBuilder() {
    _computer = new Computer();
  }

  @override
  public void buildCPU(String cpu) {
    _computer.setCPU(cpu);
  }
  
  @override
  public void buildMemory(String memory) {
    _computer.setMemory(memory);
  }
  
  @override
  public void buildStorage(String storage) {
    _computer.setStorage(storage);
  }
  
  @override
  public Computer getResult() {
    return _computer;
  }
};

// Product class
class Computer {
  private String _cpu;
  private String _memory;
  private String _storage;

  public void setCPU(String cpu) {
    _cpu = cpu;
  }

  public void setMemory(String memory) {
    _memory = memory;
  }

  public void setStorage(String storage) {
    _storage = storage;
  }

  public void display() {
    System.out.printLn("CPU: " + _cpu);
    System.out.printLn("Memory: " + _memory);
    System.out.printLn("Storage: " + _storage);
  }
};

// Director
class ComputerAssembler {
  private ComputerBuilder _desktopBuilder = new DesktopComputerBuilder();
  
  public Computer assembleDesktop() {
    _desktopBuilder.buildCPU("Intel i7");
    _desktopBuilder.buildMemory("16GB");
    _desktopBuilder.buildStorage("512GB SSD");
    
    return _desktopBuilder.getResult();
  }
};

class Main {
  public static void main(String args[]) {
    // Director
    ComputerAssembler assembler = new ComputerAssembler();

    // Products
    Computer desktop = assembler.assembleDesktop();

    System.out.printLn("Desktop Computer Configuration:");
    desktop.display();

    return 0;
  }
}

/*
Output

Desktop Computer Configuration:
CPU: Intel i7
Memory: 16GB
Storage: 512GB SSD
*/