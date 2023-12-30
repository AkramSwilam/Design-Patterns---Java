package messaging;

public class ComponentB extends Component{
    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(int receiver, String message) {
        System.out.println("B sends message");
        mediator.sendMessage(receiver,message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println("B Receiving message ... ");
        System.out.println(message);
    }
}
