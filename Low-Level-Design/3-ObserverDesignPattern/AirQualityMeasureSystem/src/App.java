import Observer.MobileNotification;
import Observer.AirNotification;
import Observable.CheckAirQuality;
import Observable.CurrAirQuality;

public class App {
    public static void main(String[] args) throws Exception {
        CheckAirQuality air = new CurrAirQuality();
        MobileNotification n1 = new MobileNotification("Yagyesh","Bhopal", air);
        MobileNotification n2 = new MobileNotification("Goyal","Bhopal", air);
        MobileNotification n3 = new MobileNotification("Goyal@gmail.com","Bhopal", air);
        MobileNotification n4 = new MobileNotification("Yagyesh","Morena", air);
        MobileNotification n5 = new MobileNotification("Goyal","Morena", air);
        MobileNotification n6 = new MobileNotification("Goyal@gmail.com","Morena", air);
        MobileNotification n7 = new MobileNotification("Yagyesh","sabalgarh", air);
        MobileNotification n8 = new MobileNotification("Goyal","sabalgarh", air);
        MobileNotification n9 = new MobileNotification("Goyal@gmail.com","sabalgarh", air);


        air.Update(120,"Bhopal");
        air.Update(358,"Morena");
        air.Update(25,"sabalgarh");
        air.Update(240,"Bhopal");
    }
}
