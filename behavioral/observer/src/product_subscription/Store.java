package product_subscription;

import java.util.ArrayList;

public class Store {
    ArrayList<Observer> observers;
    public Store(){
        observers=new ArrayList<>();
    }
    public void add(Observer o){
        observers.add(o);
    }
    public void remove(Observer o){
        observers.remove(o);
    }
    public void update(String item){
        for (Observer o:observers) {
            o.update();
        }
    }
}
