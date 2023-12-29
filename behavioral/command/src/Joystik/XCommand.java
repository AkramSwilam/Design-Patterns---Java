package Joystik;

public class XCommand implements Command{
    Player player;
    public XCommand(Player player){
        this.player=player;
    }
    @Override
    public void execute() {
        System.out.println("X Button");
        player.pass();
    }
}
