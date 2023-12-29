package Veichle_and_Workshop;

public class Produce implements Workshop{

    @Override
    public void doWork() {
        System.out.println("Producing...");
    }
}
