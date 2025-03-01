// import observable.WeatherStation;
import Observable.WeatherStation;
import Observer.Observer1;
import Observer.PhoneDisplay;
import Observer.TVDisplay;
// import Observer.Observer;


public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer1 phoneDisplay = new Observer.PhoneDisplay();
        Observer1 tvDisplay = new Observer.TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather change
        weatherStation.setWeather("Sunny");
    }
}
