package phone_states;

public class Lock implements State{
    Phone phone;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void homeButton() {
        phone.ready();
        phone.setState(new Open());
    }

    @Override
    public void lockButton() {
        phone.turnOff();
        phone.setState(new Lock());
    }
}
