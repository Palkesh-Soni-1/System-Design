package Observable;
import java.util.*;

import Observer.AirNotification;

public class CurrAirQuality implements CheckAirQuality{
    
    private Map<String, List<AirNotification>> users = new HashMap<>();
    int currAirQuality = 0;

    @Override
    public void Add(String location, AirNotification airNotification){
        users.putIfAbsent(location, new ArrayList<>()); // Ensure row exists
        users.get(location).add(airNotification);
    }


    
    @Override
    public void Update(int newAirQuality, String location){
        if(newAirQuality>=0 && newAirQuality<=50){
            giveNotification(location, "Air Quality is satisfactory");
        }
        else if(newAirQuality>=51 && newAirQuality<=100){
            giveNotification(location , "Air Quality is acceptable");
        }
        else if(newAirQuality>=101 && newAirQuality<=150){
            giveNotification(location, "Air Quality is little effective");
        }
        else if(newAirQuality>=151 && newAirQuality<=200){
            giveNotification(location, "Air Quality is helt effective");
        }
        else if(newAirQuality>=201 && newAirQuality<=300){
            giveNotification(location, "Health aleart : health effective");
        }
        else{
            giveNotification(location, "Health aleart warning : health effective");
        }
        
        
        
    }
    
    public void giveNotification(String location , String message){

        if(users.get(location)==null){
            System.out.println("nhi aaya");
            return;
        }

       for(AirNotification user : users.get(location)){
            user.Update(location,message);
       }
    }

}
