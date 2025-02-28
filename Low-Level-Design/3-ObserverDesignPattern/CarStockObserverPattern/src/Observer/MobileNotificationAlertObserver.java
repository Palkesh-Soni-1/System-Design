package Observer;


import Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver {
    public String user ;
    public StockObservable stockObservable;

    public MobileNotificationAlertObserver(String user, StockObservable stockObservable) {
        this.user = user;
        this.stockObservable = stockObservable;

        stockObservable.Add(this);
    }

    @Override
    public void update() {
        SendMessage();
    }

    public void SendMessage() {
        System.out.println("Send Message to : "+user);
        
    }

    
    
}
