package Light_Sysytem;

public class RemoteControl {
    ECommand command;

    public void setCommand(ECommand command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
