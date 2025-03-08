package Car;
import Car.SuperCar;
import CarEngine.SuperCarEngine;

public class SuperCar extends Car{

    public SuperCar(){
        
        super(new SuperCarEngine());
    }
    @Override
    public void type(){
        System.out.println("This is Super Car");
    }
}