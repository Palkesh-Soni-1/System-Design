// only one resason to change the class
// only one responsibility

class DeliverySystem{
    public static void main(String[] args){
        Delivery d = new Delivery("D1", "Delivered", "Bangalore", "Rahul", "12:00", "Raj", "1234", "Paid", "1234567890", "9876543210");
        d.printDetails();
        ChangeStatus cs = new ChangeStatus(d, "In Progress");
        ChangeDeliveryPerson cdp = new ChangeDeliveryPerson(d, "Rohit", "D2", "9876543210");
        ChangeLocation cl = new ChangeLocation(d, "Mumbai");
        ChangeDeliveryTime cdt = new ChangeDeliveryTime(d, "13:00");
        ChangeCustomerName ccn = new ChangeCustomerName(d, "Rajesh");
        ChangePaymentStatus cps = new ChangePaymentStatus(d, "Not Paid");
        ChangeCustomerMobileNumber ccmn = new ChangeCustomerMobileNumber(d, "9876543210");
        d.printDetails();
    }
}


class Delivery{
    String deliveryId;
    String status;
    String location;
    String deliveryPerson;
    String deliveryTime;
    String customerName;
    String code;
    String paymentStatus;
    String customerMobileNumber;
    String deliveryPersonMobileNumber;

    public Delivery(String id, String status, String location, String deliveryPerson, 
    String deliveryTime, String customerName, String code, String paymentStatus, String customerMobileNumber, String deliveryPersonMobileNumber){
        this.deliveryId = id;
        this.status = status;
        this.location = location;
        this.deliveryPerson = deliveryPerson;
        this.deliveryTime = deliveryTime;
        this.customerName = customerName;
        this.code = code;
        this.paymentStatus = paymentStatus;
        this.customerMobileNumber = customerMobileNumber;
        this.deliveryPersonMobileNumber = deliveryPersonMobileNumber;
    }

    public void printDetails(){
        System.out.println("Delivery Id: "+deliveryId);
        System.out.println("Status: "+status);
        System.out.println("Location: "+location);
        System.out.println("Delivery Person: "+deliveryPerson);
        System.out.println("Delivery Time: "+deliveryTime);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Code: "+code);
        System.out.println("Payment Status: "+paymentStatus);
        System.out.println("Customer Mobile Number: "+customerMobileNumber);
        System.out.println("Delivery Person Mobile Number: "+deliveryPersonMobileNumber);
    }
}

class ChangeStatus{
    Delivery d;
    public ChangeStatus(Delivery d, String status){
        String oldstatus = d.status;
        d.status = status;
        System.out.println("Status changed successfully from "+oldstatus+" to "+status);
    }
}


class ChangeDeliveryPerson{
    Delivery d;
    public ChangeDeliveryPerson(Delivery d, String deliveryPerson, String deliveryId , String deliveryPersonMobileNumber){
        String olddeliveryPerson = d.deliveryPerson;
        String olddeliveryId = d.deliveryId;
        String olddeliveryPersonMobileNumber = d.deliveryPersonMobileNumber;
        d.deliveryPerson = deliveryPerson;
        d.deliveryId = deliveryId;
        d.deliveryPersonMobileNumber = deliveryPersonMobileNumber;
        
        System.out.println("Delivery Person changed successfully from "+olddeliveryPerson+" to "+deliveryPerson);
        System.out.println("Delivery Id changed successfully from "+olddeliveryId+" to "+deliveryId);
        System.out.println("Delivery Person Mobile Number changed successfully from "+olddeliveryPersonMobileNumber+" to "+deliveryPersonMobileNumber);
    }
}

class ChangeLocation{
    Delivery d;
    public ChangeLocation(Delivery d, String location){
        String oldlocation = d.location;
        d.location = location;
        System.out.println("Location changed successfully from "+oldlocation+" to "+location);
    }
}

class ChangeDeliveryTime{
    Delivery d;
    public ChangeDeliveryTime(Delivery d, String deliveryTime){
        String olddeliveryTime = d.deliveryTime;
        d.deliveryTime = deliveryTime;
        System.out.println("Delivery Time changed successfully from "+olddeliveryTime+" to "+deliveryTime);
    }
}

class ChangeCustomerName{
    Delivery d;
    public ChangeCustomerName(Delivery d, String customerName){
        String oldcustomerName = d.customerName;
        d.customerName = customerName;
        System.out.println("Customer Name changed successfully from "+oldcustomerName+" to "+customerName);
    }
}


class ChangePaymentStatus{
    Delivery d;
    public ChangePaymentStatus(Delivery d, String paymentStatus){
        String oldpaymentStatus = d.paymentStatus;
        d.paymentStatus = paymentStatus;
        System.out.println("Payment Status changed successfully from "+oldpaymentStatus+" to "+paymentStatus);
    }
}

class ChangeCustomerMobileNumber{
    Delivery d;
    public ChangeCustomerMobileNumber(Delivery d, String customerMobileNumber){
        String oldcustomerMobileNumber = d.customerMobileNumber;
        d.customerMobileNumber = customerMobileNumber;
        System.out.println("Customer Mobile Number changed successfully from "+oldcustomerMobileNumber+" to "+customerMobileNumber);
    }
}