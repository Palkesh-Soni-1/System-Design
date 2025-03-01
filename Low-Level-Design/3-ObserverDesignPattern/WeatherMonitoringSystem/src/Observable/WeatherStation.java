package Observable;

import Observer.Observer1;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer1> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(Observer1 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer1 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer1 observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}

