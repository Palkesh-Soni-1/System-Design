package Observable;
import Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;
public class IphoneObservable implements StockObservable{
    private List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    private int stockCount=0;

    public int getStockCount() {
        return stockCount;
    }
    @Override
    public void increaseStockCount(int newStockCount) {
        if(this.stockCount==0 && newStockCount>0){
            notifyObservers();
        }
        stockCount+=newStockCount;
    }

    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }
}

