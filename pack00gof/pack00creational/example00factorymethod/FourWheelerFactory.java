package pack00creational.example00factorymethod;

// Concrete Factory: FourWheeler
public class FourWheelerFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new FourWheeler();
  }
}