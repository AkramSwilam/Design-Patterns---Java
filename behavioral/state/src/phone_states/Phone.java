package phone_states;

public class Phone {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
    public void lock(){
        System.out.println("phone is locking");
    }
    public void turnOff(){
        System.out.println("phone is Off");
    }
    public void ready(){
        System.out.println("ready");
    }
}
