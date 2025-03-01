
import Strategy.RapidoStrategy;

public class BookRide {
    public RapidoStrategy rapido ;

    public BookRide(RapidoStrategy rapido) {
        this.rapido = rapido;
    }

    public void ShowRideType(){
        rapido.bookRide();
    }

}
