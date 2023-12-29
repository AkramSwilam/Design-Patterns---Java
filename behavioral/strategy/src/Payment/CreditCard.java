package Payment;

public class CreditCard extends PaymentStrategy{
    String number;
    String ccv;
    String date;

    public CreditCard(String number, String ccv, String date) {
        this.number = number;
        this.ccv = ccv;
        this.date = date;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paying"+price+" from Credit Card");
    }
}
