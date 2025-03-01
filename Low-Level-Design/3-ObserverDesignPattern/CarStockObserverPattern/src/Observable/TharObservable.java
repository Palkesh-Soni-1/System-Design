package Observable;

import Observer.NotificationAlertObserver;
import java.util.List;
import java.util.ArrayList;

public class TharObservable implements StockObservable {
    private List<NotificationAlertObserver> users = new ArrayList<NotificationAlertObserver>();
    int currstock = 0;


    public void IncreaseStockCount(int newStock) {
        
        if(currstock == 0 && newStock > 0){
            NotifyObservers();
        }

        currstock = currstock + newStock;
        
    }

    public void Add(NotificationAlertObserver obj) {
        users.add(obj);
    }

    public void Remove(NotificationAlertObserver obj) {
        users.remove(obj);
    }

    public void NotifyObservers() {
        for (NotificationAlertObserver user : users) {
            user.update();
        }
    }

    
    
}
