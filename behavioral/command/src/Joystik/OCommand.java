package Joystik;

public class OCommand implements Command {
    Player player;
    OCommand(Player player){
        this.player=player;
    }
    @Override
    public void execute() {
        System.out.println("O Button");
        player.shoot();
    }
}
