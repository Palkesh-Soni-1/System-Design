package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifyObservers();
    public void increaseStockCount(int n);
};
