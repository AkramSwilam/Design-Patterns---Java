package Veichle_and_Workshop;

public class Car extends Vehicle{

    public Car(Workshop workshop) {
        super(workshop);
    }
    @Override
    public void doWork(){
        super.doWork();
        System.out.println("in Car");
    }
}
