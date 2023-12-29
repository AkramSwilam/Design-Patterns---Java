package phone_states;

public interface State {
    void homeButton();
    void lockButton();
    void setPhone(Phone phone);
}
