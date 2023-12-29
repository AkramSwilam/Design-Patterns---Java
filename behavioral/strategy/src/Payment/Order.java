package Payment;

import java.util.ArrayList;

public class Order {
    ArrayList<Item> items;
    public Order(){
        items=new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }

    private double calculatePrice(){
        double total=0;
        for (Item item:items) {
            total+=item.price;
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy){
        System.out.println("paying ...");
        paymentStrategy.pay(calculatePrice());
    }

}
