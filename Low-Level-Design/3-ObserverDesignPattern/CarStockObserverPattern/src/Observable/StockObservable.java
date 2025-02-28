package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    public void Add(NotificationAlertObserver obj);
    public void Remove(NotificationAlertObserver obj);
    public void NotifyObservers();
    public void IncreaseStockCount(int n);
}
