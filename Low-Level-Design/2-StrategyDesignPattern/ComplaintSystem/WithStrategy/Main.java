public class Main {
    public static void main(String[] args) {
        Complaint c1 = new ElectricityCom();
        c1.complain();
        Complaint c2 = new MessCom();
        c2.complain();
        Complaint c3 = new SanitationCom();
        c3.complain();
    }
}
