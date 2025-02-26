

import Strategy.BikeRapidoStrategy;

public class BikeBookRide extends BookRide {
   
    public BikeBookRide(){
        super(new BikeRapidoStrategy());
    }
    
}
