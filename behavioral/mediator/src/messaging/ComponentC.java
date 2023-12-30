package messaging;

public class ComponentC extends Component{
    public ComponentC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(int receiver, String message) {
        System.out.println("C sends message");
        mediator.sendMessage(receiver,message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println("C receiving message ..");
        System.out.println(message);
    }
}
