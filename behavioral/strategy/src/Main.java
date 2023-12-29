import Duck.*;
import Payment.Item;
import Payment.Order;
import Payment.PayPal;
import Payment.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
//        Item item=new Item("p1",55);
//        Item item1=new Item("p2",180);
//        PaymentStrategy paymentStrategy=new PayPal("AKRAM","A=123");
//        Order order=new Order();
//        order.addItem(item);
//        order.addItem(item1);
//        order.pay(paymentStrategy);

        FlyStrategy flyStrategy=new FlyWithWings();
        QuackStrategy quackStrategy= new NoQuack();
        Duck duck=new DuckA(flyStrategy,quackStrategy);
        duck.fly();
        duck.quack();
    }
}