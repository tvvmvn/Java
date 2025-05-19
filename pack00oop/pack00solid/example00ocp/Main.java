package pack00solid.example00ocp;

// you better extends a class, without modifying a class.
// you can go back to previous class at anytime.

class PaymentSystem {
   void handlingCreditCard() {}
};

class PaymentSystemExtended extends PaymentSystem {
   void handlingMobileWallet() {}
};

public class Main {}