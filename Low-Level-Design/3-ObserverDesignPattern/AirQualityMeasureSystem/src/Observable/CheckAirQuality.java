package Observable;

import Observer.AirNotification;

public interface CheckAirQuality {
    public void Add(String location, AirNotification airNotification);
    public void Update(int newAirQuality, String location);
}
