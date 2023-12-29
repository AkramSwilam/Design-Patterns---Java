import box_price.Box;
import box_price.Component;
import box_price.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product("p1",100);
        Product p2=new Product("p2",150);
        Product p3=new Product("p3",200);
        ArrayList<Component> components=new ArrayList<>();
        components.add(p1);
        components.add(p2);
        Box box1 =new Box("box1",components);
        ArrayList<Component> components2=new ArrayList<>();
        components2.add(p3);
        components2.add(box1);
        Box box2=new Box("box2",components2);
        System.out.println(box2.getPrice());
    }
}