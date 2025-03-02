package Decoration;
import Base.Garden;

public class FlowersDecorate extends DecoratorGarden{
     Garden garden;  //has-a relation;

    public FlowersDecorate(Garden g){
        this.garden = g;
    }

    @Override
    public int Cost(){
        return garden.Cost() + 3000;
    }
}
