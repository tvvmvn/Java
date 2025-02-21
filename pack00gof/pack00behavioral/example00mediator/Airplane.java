package pack00gof.pack00behavioral.example00mediator;

// Colleague(to be mediated) Interface 
public interface Airplane {
  void requestTakeoff();
  void requestLanding();
  void notifyAirTrafficControl(String message);
}
 
