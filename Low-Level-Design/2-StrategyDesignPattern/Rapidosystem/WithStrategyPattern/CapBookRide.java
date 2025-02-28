

import Strategy.capRapidoStrategy;

public class CapBookRide extends BookRide{
    
    public CapBookRide(){
        super(new capRapidoStrategy());
    }

    
}
