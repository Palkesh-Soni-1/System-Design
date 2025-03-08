import Car.Car;
import CarFactory.CarFactory;
import CarFactory.CarFactory;
import CarFactory.SuperCarFactory;
import CarFactory.NormalCarFactory;
import CarEngine.CarEngine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = CarFactory.getcar(new SuperCarFactory());
        car.type();
        car.engine.enginetype();
    }
}
