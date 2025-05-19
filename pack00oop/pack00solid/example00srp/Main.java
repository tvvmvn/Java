package pack00solid.example00srp;

// Class should be responsible for only one task.
class Chef {
  void slice() {};
  void boiling() {};
  void tasting() {};
};

class Casher {
  void receiveMoney() {};
  void giveCharge() {};
  void handleFinance() {};
};

class Waiter {
  void greeting() {};
  void takeOrder() {};
  void serveFood() {};
};

public class Main {}