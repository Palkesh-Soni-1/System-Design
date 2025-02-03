package ToppingDecorator;

import BasePizza.BasePizza;

public class Mashroom extends ToppingDecorator{
    private BasePizza pizza;
    public Mashroom(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+25;
    }
}
