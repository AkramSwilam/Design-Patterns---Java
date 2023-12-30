package messaging;

public class ComponentA extends Component{

    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    @Override
   public void sendMessage(int receiver, String message) {
        System.out.println("A sends message");
        mediator.sendMessage(receiver,message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println("A receiving message");
        System.out.println(message);
    }
}
