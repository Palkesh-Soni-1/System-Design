package CarFactory;
import CarFactory.AbstractCarFactory;
import Car.Car;
import Car.NormalCar;

public class NormalCarFactory extends AbstractCarFactory{

    @Override
    public Car type(){
        return new NormalCar();
    }
}