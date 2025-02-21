package pack00gof.pack00behavioral.example00mediator;

// Mediator Interface
public interface AirTrafficControlTower {
  void requestTakeoff(Airplane airplane);
  void requestLanding(Airplane airplane);
}