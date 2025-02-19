// A class should have only 1 reason to change

public class SRP1 {
    public static void main(String[] args) {
        Marker marker1 = new Marker("Cello", "GREEN", 2025, 60);
        Invoice invoice1 = new Invoice(marker1,50);
        invoice1.calculateTotal();
        InvoiceSave invoiceSave1 = new InvoiceSave(invoice1);
        invoiceSave1.saveToDB();
        InvoicePrinter invoicePrinter1 = new InvoicePrinter(invoice1);
        invoicePrinter1.print();
    }
}

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price)
    {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
        System.out.println(name+" "+"marker successfully created");
    }
}


//different classes for calculate, save and print
class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity)
    {
        this.marker = marker;
        this.quantity=quantity;
    }

    public int calculateTotal()
    {
        int price = ((marker.price)*quantity);
        System.out.println("Price Calculated-: "+ price);
        return price;
    }
}

//save class
class InvoiceSave{
    Invoice invoice;
    public InvoiceSave(Invoice invoice)
    {
        this.invoice = invoice;
    }
    public void saveToDB(){
        System.out.println("Saved Successfully");
    }
}

//print class
class InvoicePrinter{
    Invoice invoice;
    public InvoicePrinter(Invoice invoice)
    {
        this.invoice=invoice;
    }
    public void print(){
        System.out.println("Printed Successfully");
    }
}