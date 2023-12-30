package messaging;

public abstract class Component {
    Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

   public abstract void sendMessage(int receiver, String message);
    abstract void receiveMessage(String message);
}
