package Observer;

import Observable.CheckAirQuality;

public class MobileNotification implements AirNotification{
    public String user;
    public CheckAirQuality checkAirQuality;

    public MobileNotification(String user, String location, CheckAirQuality checkAirQuality){
        this.user = user;
        // this.location = location;
        this.checkAirQuality = checkAirQuality;

        // System.out.println(user);
        if(checkAirQuality!=null)
        this.checkAirQuality.Add(location,this);
    }



    @Override
    public void Update(String location , String message){
        Notify(location,message);
    }


    public void Notify(String location , String message){
        System.out.println(user+" : Air Condition of "+location+"is "+message);
    }
}
