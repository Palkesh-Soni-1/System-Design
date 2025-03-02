import Base.LRCGarden;
import Base.VIPGarden;
import Base.Garden;
import Decoration.Catering;
import Decoration.FlowersDecorate;
import Decoration.LightingDecorate;
import Decoration.DecoratorGarden;

public class App {
    public static void main(String[] args) throws Exception {
        Garden g = new Catering(new FlowersDecorate(new LightingDecorate(new LRCGarden())));
        int cost = g.Cost();
        Garden g1 = new Catering(new FlowersDecorate(new LightingDecorate(new VIPGarden())));
        int cost2 = g1.Cost();

        System.out.println("The total cost in LRCGarden is : "+cost);
        System.out.println("The total cost in VIPGarden is : "+cost2);

    }
}
