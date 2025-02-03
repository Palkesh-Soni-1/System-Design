package Observer;

import Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{
    private String uname;
    private StockObservable observable;
    public MobileNotificationAlertObserver(String uname,StockObservable observable){
        this.uname=uname;
        this.observable=observable;
        observable.add(this);
    }

    @Override
    public void update() {
        sendMessage();
    }
    public void sendMessage(){
        System.out.println("Message sent to "+uname);
        // Send actual msg
    }
}
