import Strategy.ComplaintStrategy;
public class Complaint {
    final private ComplaintStrategy strategy;
    public Complaint(ComplaintStrategy strategy) {
        this.strategy = strategy;
    }
    public void complain() {
        strategy.complain();
    }
}
