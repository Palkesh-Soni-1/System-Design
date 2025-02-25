public class DeliveryDiscount{

    public static void finalTotalAmount(Order o, float dis){
        ChangeTotalAount c = new ChangeTotalAount();
        c.getDiscount(o, dis);
        System.out.println("Total Amount: "+o.getTotalAmount());
    }

    public static void main(String[] args){

        Order o = new Order(1000, 50);
        System.out.println("Initial Total Amount: "+o.getTotalAmount());
        FreeDelivery f1 = new FreeDelivery();
        finalTotalAmount(o, f1.getDiscount(o));
        Order o1 = new Order(7000, 50);
        System.out.println("Initial Total Amount: "+o1.getTotalAmount());
        finalTotalAmount(o1, f1.getDiscount(o1));
        


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
        o.totalAmount = o.totalAmount - dis;
    }
    
}


interface Discount{

    public float getDiscount(Order o);
    
}

class FreeDelivery implements Discount{
    @Override
    public float getDiscount(Order o){
        if(o.totalAmount > 5000){
            return o.deliverycharge;
        }

        return 0;
    }
}

