import messaging.*;

public class Main {
    public static void main(String[] args) {

        Mediator mediator= new MessagingMediator();
        ComponentA componentA= new ComponentA(mediator);
        ComponentB componentB= new ComponentB(mediator);
        ComponentC componentC= new ComponentC(mediator);


        int a= mediator.addComponent(componentA);
        int b= mediator.addComponent(componentB);
        int c= mediator.addComponent(componentC);


        componentA.sendMessage(b,"welcome");
        componentC.sendMessage(a,"Hello");
    }
}