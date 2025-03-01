public class DeliveryDiscount{

    public static void main(String[] args){

        Family f1 = new Family1();
        f1.familyType();
        Family f2 = new Family2(); 
        f2.familyType();
        
    }
}


class Order{
    String food;
}

interface Family{

    public void familyType();
    
}

class Family1 implements Family{
    @Override
    public void familyType(){
        System.out.println("Family1 is Non-veg");
    }
}

class Family2 implements Family{
    @Override
    public void familyType(){
        System.out.println("Family2 is veg");
    }
}

