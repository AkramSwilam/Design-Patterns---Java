package messaging;

public interface Mediator {
    void sendMessage(int receiver, String message);
    int addComponent(Component c);
}
