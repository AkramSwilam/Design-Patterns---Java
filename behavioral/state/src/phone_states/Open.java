package phone_states;

public class Open implements State{
    Phone phone;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void homeButton() {
        phone.ready();
    }

    @Override
    public void lockButton() {
        phone.lock();
    }
}
