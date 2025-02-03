import BasePizza.BasePizza;
import BasePizza.FarmhousePizza;
import ToppingDecorator.ExtraCheese;
import ToppingDecorator.Mashroom;

public class App {
    public static void main(String[] args) throws Exception {
        BasePizza basePizza=new FarmhousePizza();
        BasePizza newPizza1=new ExtraCheese(basePizza);
        BasePizza newPizza2=new Mashroom(newPizza1);
        BasePizza newPizza3=new ExtraCheese(newPizza2);
        System.out.println("Cost is: "+newPizza3.cost());
    }
}
