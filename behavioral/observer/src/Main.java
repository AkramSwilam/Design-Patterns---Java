import product_subscription.EmailNotifier;
import product_subscription.Store;

public class Main {
    public static void main(String[] args) {
        EmailNotifier emailNotifier=new EmailNotifier();
        Store store= new Store();
        store.add(emailNotifier);
        store.update("Nike");
    }
}