

import Strategy.AutoRapidoStrategy;

public class AutoBookRide extends BookRide{
    
    public AutoBookRide(){
        super(new AutoRapidoStrategy());
    }

}
