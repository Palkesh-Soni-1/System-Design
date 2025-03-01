package Observable;
import Observer.DisplayObserver;
public interface Subject {
    void addObserver(DisplayObserver observer);
    void removeObserver(DisplayObserver observer);
    void notifyObservers();
}

