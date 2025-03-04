import CarModel.CarModel;
import CarFactory.CarFactory;

public class App {
    public static void main(String[] args) throws Exception {
        
        CarModel carmodel = CarFactory.make("SUVCarModel");
        // CarFactories factory = new CarFactories();
        // CarModels carmodel = factory("SUVCarModel");

        carmodel.Show();
    }
}
