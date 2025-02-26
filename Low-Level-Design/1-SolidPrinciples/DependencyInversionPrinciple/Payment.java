public class Payment {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        DebitCard dc = new DebitCard();
        NetBanking nb = new NetBanking();
        Wallet w = new Wallet();
        UPI u = new UPI();

        checkPaymentMethod pm = new checkPaymentMethod(cc);
        pm.checkPaymentMode();
        checkPaymentMethod pm1 = new checkPaymentMethod(dc);
        pm1.checkPaymentMode();
        checkPaymentMethod pm2 = new checkPaymentMethod(nb);
        pm2.checkPaymentMode();
        checkPaymentMethod pm3 = new checkPaymentMethod(w);
        pm3.checkPaymentMode();
        checkPaymentMethod pm4 = new checkPaymentMethod(u);
        pm4.checkPaymentMode();
    }
}


interface PaymentMethod {
    public void pay();
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }
}

class DebitCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Debit Card Payment");
    }
}

class NetBanking implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Net Banking Payment");
    }
}

class Wallet implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Wallet Payment");
    }
}

class UPI implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}

class checkPaymentMethod{
    PaymentMethod mode;

    public checkPaymentMethod(PaymentMethod mode){
        this.mode = mode;
    }

    public void checkPaymentMode(){
        mode.pay();
    }
}
