package Car;
import Car.NormalCar;
import CarEngine.NormalCarEngine;

public class NormalCar extends Car{

    public NormalCar(){
        super(new NormalCarEngine());
    }

    @Override
    public void type(){
        System.out.println("This is Normal Car");
    }
}