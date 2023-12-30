package messaging;

import java.util.ArrayList;

public class MessagingMediator implements Mediator {
    private int count;
    ArrayList<Component> components;
    public MessagingMediator(){
        count=0;
        components=new ArrayList<>();
    }

    @Override
    public void sendMessage(int receiver, String message) {
        components.get(receiver).receiveMessage(message);
    }

    @Override
    public int addComponent(Component c){
        components.add(count,c);
        count++;
        return count-1;
    }
}
