// Client code
public class OCP{
    public static void main(String[] args) {
        InvoiceOCP invoice = new InvoiceOCP(1000);

        Discount discount = new SeasonalDiscount(); // Can switch to any discount strategy
        int finalAmount = discount.applyDiscount(invoice.getTotalAmount());

        System.out.println("Final Amount after discount: " + finalAmount);
    }
}

// Invoice class (closed for modification)
class InvoiceOCP {
    private int totalAmount;

    public InvoiceOCP(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}

// Abstract class for discount strategies (open for extension)
interface Discount {
    public int applyDiscount(int amount);
}

// Concrete discount strategy for seasonal discount
class SeasonalDiscount implements Discount {
    @Override
    public int applyDiscount(int amount) {
        return amount - (amount * 10 / 100); // 10% off
    }
}

// Concrete discount strategy for clearance sale
class ClearanceDiscount implements Discount {
    @Override
    public int applyDiscount(int amount) {
        return amount - (amount * 30 / 100); // 30% off
    }
}