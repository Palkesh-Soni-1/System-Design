import Observable.StockObservable;
import Observable.TharObservable;
import Observer.EmailNotificationAlertObserver;
import Observer.MobileNotificationAlertObserver;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) {
        StockObservable Thar=new TharObservable();
        NotificationAlertObserver observer=new MobileNotificationAlertObserver("Yagyesh",Thar);
        NotificationAlertObserver observer1=new MobileNotificationAlertObserver("Goyal",Thar);
        NotificationAlertObserver observer2=new EmailNotificationAlertObserver("Goyal@gmail.com",Thar);

        Thar.IncreaseStockCount(5);
    }
}
