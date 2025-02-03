package Observer;

import Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    private String email;
    private StockObservable observable;

    public EmailNotificationAlertObserver(String email,StockObservable observable){
        this.email=email;
        this.observable=observable;
        observable.add(this);
    }

    @Override
    public void update() {
        sendMail();
    }

    public void sendMail(){
        System.out.println("Mail sent successfully on "+email);
        // Send actual mail
    }
}
