public class ISP{
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print();

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.scan();
    }
}

// Separate interfaces
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

// Class that implements only print functionality
class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

// Class that implements both print and scan
class AdvancedPrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}
