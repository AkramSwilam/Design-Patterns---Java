import phone_states.Lock;
import phone_states.Phone;
import phone_states.State;

public class Main {
    public static void main(String[] args) {
        State lockState= new Lock();
        Phone phone= new Phone();
        phone.setState(lockState);
        lockState.setPhone(phone);
        lockState.homeButton();
    }
}