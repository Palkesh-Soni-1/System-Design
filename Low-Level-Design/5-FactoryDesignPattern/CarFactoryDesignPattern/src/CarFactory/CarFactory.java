package CarFactory;
import CarModel.CarModel;
import CarModel.SUVCarModel;
import CarModel.SedanCarModel;

public class CarFactory {
    

    public static CarModel make(String car){

       if(car.equalsIgnoreCase("SUVCarModel")){
        return new SUVCarModel();
       }
       else if(car.equalsIgnoreCase("SedanCarModel")){
        return new SedanCarModel();
       }
       return null;
    }


    
}
