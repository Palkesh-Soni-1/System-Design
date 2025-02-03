import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.MobileNotificationAlertObserver;
import Observer.EmailNotificationAlertObserver;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StockObservable iphoneObservableInstance=new IphoneObservable();
        NotificationAlertObserver observer=new MobileNotificationAlertObserver("satyam",iphoneObservableInstance);
        NotificationAlertObserver observer1=new MobileNotificationAlertObserver("shivam",iphoneObservableInstance);
        NotificationAlertObserver observer2=new EmailNotificationAlertObserver("sundaram@gmail.com",iphoneObservableInstance);

        iphoneObservableInstance.increaseStockCount(5);

//        IphoneObservable iphone= (IphoneObservable) iphoneObservableInstance;
//        int k=iphone.getStockCount();
//        System.out.println("Count: "+k);
    }
}
