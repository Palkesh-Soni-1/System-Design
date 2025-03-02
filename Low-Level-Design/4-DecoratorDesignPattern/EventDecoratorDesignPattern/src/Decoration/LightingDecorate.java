package Decoration;
import Base.Garden;

public class LightingDecorate extends DecoratorGarden {
    public Garden garden;  //has-a relation;

    public LightingDecorate(Garden g){
        this.garden = g;
    }

    @Override
    public int Cost(){
        return garden.Cost() + 10000;
    }
}
