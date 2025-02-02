public class SRP {
    public static void main(String[] args) {
        Marker marker = new Marker("Camlin", "Blue", 2024, 50);
        Invoice invoice = new Invoice(marker, 5);
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.printInvoice();

        InvoiceSaver saver = new InvoiceSaver(invoice);
        saver.saveToDB();
    }
}

class Marker {
    private String name;
    private String color;
    private int mfg;
    private int price;

    public Marker(String name, String color, int mfg, int price) {
        this.name = name;
        this.color = color;
        this.mfg = mfg;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return marker.getPrice() * this.quantity;
    }
}

class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("Total Price: " + invoice.calculateTotal());
    }
}

class InvoiceSaver {
    private Invoice invoice;

    public InvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving invoice to database...");
    }
}
