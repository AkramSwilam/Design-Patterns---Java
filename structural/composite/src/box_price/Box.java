package box_price;

import java.util.ArrayList;

public class Box implements Component{
    String name;
    ArrayList<Component> components=new ArrayList<>();

    public Box(String name, ArrayList<Component> components) {
        this.name = name;
        this.components = components;
    }

    void addComponent(Component c){
        components.add(c);
    }
    void removeComponent(Component c){
        components.remove(c);
    }
    @Override
    public double getPrice() {
        double total=0;
        for (Component component:components) {
            total+=component.getPrice();
        }
        return total;
    }
}
