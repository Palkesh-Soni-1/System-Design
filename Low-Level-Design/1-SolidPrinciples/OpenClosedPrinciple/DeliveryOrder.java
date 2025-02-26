public class DeliveryOrder {
    public static void main(String[] args){
        Order o = new Order(1000, 50);
        ChangeTotalAount c = new ChangeTotalAount();
        Discount15 d = new Discount15();
        c.getDiscount(o, d.getDiscount(o));
        System.out.println("Total Amount: "+o.getTotalAmount());
        Discount10 d1 = new Discount10();
        c.getDiscount(o, d1.getDiscount(o));
        System.out.println("Total Amount: "+o.getTotalAmount());
        FreeDelivery d2 = new FreeDelivery();
        c.getDiscount(o, d2.getDiscount(o));
        System.out.println("Total Amount: "+o.getTotalAmount());
    }
}


class Order{
    float price;
    int deliverycharge;
    float totalAmount;

    public Order (int price,int deliverycharge){
        this.price = price;
        this.deliverycharge = deliverycharge;
        this.totalAmount = price+deliverycharge;
    }

    public float getTotalAmount(){
        return totalAmount;
    }
}

class ChangeTotalAount {

    public void getDiscount(Order o, float dis){
        o.totalAmount = o.totalAmount-dis;
    }
    
}


interface Discount{

    public float getDiscount(Order o);
    
}

class Discount15 implements Discount{
    @Override
    public float getDiscount(Order o){
        return o.price*15/100;
    }
}

class Discount10 implements Discount{
   
    public float getDiscount(Order o){
        return o.price*10/100;
    }
}

class FreeDelivery implements Discount{
    
    public float getDiscount(Order o){
        return  o.deliverycharge;
    }
}


