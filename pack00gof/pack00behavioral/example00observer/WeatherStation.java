package pack00gof.pack00behavioral.example00observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject 
public class WeatherStation implements Subject {
  // Observers for displaying
  private List<Observer> observers = new ArrayList<>();
  private String weather;

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(weather);
    }
  }

  public void setWeather(String newWeather) {
    this.weather = newWeather;

    notifyObservers();
  }
}

