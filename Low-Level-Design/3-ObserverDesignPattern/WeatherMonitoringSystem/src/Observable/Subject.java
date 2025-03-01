package Observable;
import Observer.Observer1;
public interface Subject {
    void addObserver(Observer1 observer);
    void removeObserver(Observer1 observer);
    void notifyObservers();
}

