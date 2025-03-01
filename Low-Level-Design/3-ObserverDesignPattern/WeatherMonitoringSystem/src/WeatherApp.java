import Observable.WeatherStation;
import Observer.DisplayObserver;


public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayObserver phoneDisplayObserver = new Observer.PhoneDisplay();
        DisplayObserver tvDisplayObserver = new Observer.TVDisplay();

        weatherStation.addObserver(phoneDisplayObserver);
        weatherStation.addObserver(tvDisplayObserver);

        // Simulating weather change
        weatherStation.setWeather("Sunny");
    }
}
