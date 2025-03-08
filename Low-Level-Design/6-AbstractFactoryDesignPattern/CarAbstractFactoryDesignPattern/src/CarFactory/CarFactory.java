package CarFactory;
import Car.Car;

public class CarFactory{
    public static Car getcar(AbstractCarFactory car){
        return car.type();
    }
}