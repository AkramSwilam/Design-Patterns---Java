package Payment;

public class PayPal extends PaymentStrategy {
    String email;
    String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paying"+price+" from PayPal account");
    }
}
