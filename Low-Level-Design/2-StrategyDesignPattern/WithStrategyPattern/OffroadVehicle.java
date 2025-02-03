import Strategy.OffroadDriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new OffroadDriveStrategy());
    }
}