package Joystik;

public class Joystick {
    public void setCommand(Command command) {
        this.command = command;
    }

    Command command;

    public void executeCommand(){
        command.execute();
    }
}
