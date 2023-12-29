package Veichle_and_Workshop;

public abstract class Vehicle {
    Workshop workshop;
    Vehicle(Workshop workshop){
        this.workshop=workshop;
    }
    public void doWork(){
        workshop.doWork();
    }
}
