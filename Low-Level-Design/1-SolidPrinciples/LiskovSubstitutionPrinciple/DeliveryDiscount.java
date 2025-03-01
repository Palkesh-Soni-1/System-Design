

public class DeliveryDiscount{

    public static void main(String[] args){

        Family family1 = new NonVegFamily();
        family1.familyType();
        family1.orderMeat();
        Family family2 = new PureVegFamily(); 
        family2.familyType();
        
    }
}



interface Family {
    void familyType();
    String getFamilyType();
}


interface VegOrder{
    void orderVeg();
}

interface NonVegOrder {
    void orderNonVeg();
}

class NonVegFamily implements Family, NonVegOrder, VegOrder{
    @Override
    public void familyType() {
        System.out.println("This is a Non-Vegetarian Family.");
    }

    @Override
    public String getFamilyType() {
        return "Non-Vegetarian Family";
    }

    @Override
    public void orderNonVeg() {
        System.out.println("Ordering meat for Non-Vegetarian Family.");
    }

    @Override
    public void orderVeg(){
         System.out.println("Ordering veg");
    }
}

class PureVegFamily implements Family, VegOrder {
    @Override
    public void familyType() {
        System.out.println("This is a Pure Vegetarian Family.");
    }

    @Override
    public String getFamilyType() {
        return "Pure Vegetarian Family.";
    }

    @Override
    public void orderVeg(){
         System.out.println("Ordering veg");
    }
}