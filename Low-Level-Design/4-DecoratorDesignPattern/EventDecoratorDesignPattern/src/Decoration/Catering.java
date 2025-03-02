package Decoration;
import Base.Garden;

public class Catering extends DecoratorGarden{
    public Garden garden;  //has-a relation;

    public Catering(Garden g){
        this.garden = g;
    }

    @Override
    public int Cost(){
        return garden.Cost() + 2000;
    }
}
