package Observable;

import Observer.DisplayObserver;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<DisplayObserver> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(DisplayObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DisplayObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}

