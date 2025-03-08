package Car;
import CarEngine.CarEngine;

public abstract class Car{
    
    public CarEngine engine;
    public Car(){}
    public Car(CarEngine engine){
        this.engine = engine;
        
    }
    public abstract void type();

}
