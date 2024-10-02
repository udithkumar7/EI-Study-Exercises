import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface WeatherSubject {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// Concrete Subject
class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

// Observer Interface
interface WeatherObserver {
    void update(float temperature);
}

// Concrete Observers
class MobileApp implements WeatherObserver {
    public void update(float temperature) {
        System.out.println("Mobile App: Temperature updated to " + temperature + " degrees.");
    }
}

class WebApp implements WeatherObserver {
    public void update(float temperature) {
        System.out.println("Web App: Temperature updated to " + temperature + " degrees.");
    }
}

// Demo Class
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        weatherStation.registerObserver(mobileApp);
        weatherStation.registerObserver(webApp);

        weatherStation.setTemperature(30.5f);
        weatherStation.setTemperature(25.0f);
    }
}
