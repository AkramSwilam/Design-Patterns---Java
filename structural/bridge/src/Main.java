import Veichle_and_Workshop.Car;
import Veichle_and_Workshop.Produce;
import Veichle_and_Workshop.Vehicle;
import Veichle_and_Workshop.Workshop;
import shape_and_color.Circle;
import shape_and_color.Color;
import shape_and_color.Red;
import shape_and_color.Shape;

public class Main {
    public static void main(String[] args) {
//        Color red=new Red();
//        Shape circle=new Circle(red);
//        circle.colorOp();

        Workshop workshop= new Produce();
        Vehicle vehicle= new Car(workshop);
        vehicle.doWork();
    }
}