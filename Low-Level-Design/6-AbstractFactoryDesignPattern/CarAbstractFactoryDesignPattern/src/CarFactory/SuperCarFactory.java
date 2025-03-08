package CarFactory;
import CarFactory.AbstractCarFactory;
import Car.Car;
import Car.SuperCar;

public class SuperCarFactory extends AbstractCarFactory{

    @Override
    public Car type(){
       
        return new SuperCar();
    }
}  