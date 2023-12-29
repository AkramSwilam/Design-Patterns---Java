import Joystik.*;
import Light_Sysytem.*;

public class Main {
    public static void main(String[] args) {
//        Player player1= new Player();
//        Command command=new XCommand(player1);
//        Joystick joystick= new Joystick();
//        joystick.setCommand(command);
//        joystick.executeCommand();

        ElectronicDevice airCondition=new AirCondition();
        OnCommand command=  new OnCommand();
        command.setElectronicDevice(airCondition);
        RemoteControl remoteControl= new RemoteControl();
        remoteControl.setCommand(command);
        remoteControl.executeCommand();
    }
}