public class Main {
    public static void main(String[] args) {
        Complaint c1 = new ElectricityCom();
        c1.registerComplaint();
        Complaint c2 = new MessCom();
        c2.registerComplaint();
        Complaint c3 = new SanitationCom();
        c3.registerComplaint();
    }
    
}
