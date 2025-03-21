package pack00solid.example00ocp;

class PaymentProcessor {
  public void CreditCardProcess() {}
};

// you better extends a class, without modifying a class.
// you can go back to previous class at anytime.

class PaymentProcessorExtended extends PaymentProcessor {
  public void MobilePayProcess() {}
};

public class Main {}