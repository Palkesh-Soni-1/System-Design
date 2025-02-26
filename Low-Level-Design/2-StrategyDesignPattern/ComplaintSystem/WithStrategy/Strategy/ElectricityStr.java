package Strategy;
public class ElectricityStr implements ComplaintStrategy {
    @Override
    public void complain() {
        System.out.println("Electricity Complaint");
    }
}
