package pack00creational.example00factorymethod;


// Concrete Factory: TwoWheeler
public class TwoWheelerFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new TwoWheeler();
  }
}